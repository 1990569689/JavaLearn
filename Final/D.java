package Final;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * Java 多线程编程
Java 给多线程编程提供了内置的支持。 一条线程指的是进程中一个单一顺序的控制流，一个进程中可以并发多个线程，每条线程并行执行不同的任务。

多线程是多任务的一种特别的形式，但多线程使用了更小的资源开销。

这里定义和线程相关的另一个术语 - 进程：一个进程包括由操作系统分配的内存空间，包含一个或多个线程。一个线程不能独立的存在，它必须是进程的一部分。一个进程一直运行，直到所有的非守护线程都结束运行后才能结束。

多线程能满足程序员编写高效率的程序来达到充分利用 CPU 的目的。

一个线程的生命周期
线程是一个动态执行的过程，它也有一个从产生到死亡的过程。

下图显示了一个线程完整的生命周期。



新建状态:
使用 new 关键字和 Thread 类或其子类建立一个线程对象后，该线程对象就处于新建状态。它保持这个状态直到程序 start() 这个线程。

就绪状态:
当线程对象调用了start()方法之后，该线程就进入就绪状态。就绪状态的线程处于就绪队列中，要等待JVM里线程调度器的调度。

运行状态:
如果就绪状态的线程获取 CPU 资源，就可以执行 run()，此时线程便处于运行状态。处于运行状态的线程最为复杂，它可以变为阻塞状态、就绪状态和死亡状态。

阻塞状态:
如果一个线程执行了sleep（睡眠）、suspend（挂起）等方法，失去所占用资源之后，该线程就从运行状态进入阻塞状态。在睡眠时间已到或获得设备资源后可以重新进入就绪状态。可以分为三种：

等待阻塞：运行状态中的线程执行 wait() 方法，使线程进入到等待阻塞状态。

同步阻塞：线程在获取 synchronized 同步锁失败(因为同步锁被其他线程占用)。

其他阻塞：通过调用线程的 sleep() 或 join() 发出了 I/O 请求时，线程就会进入到阻塞状态。当sleep() 状态超时，join() 等待线程终止或超时，或者 I/O 处理完毕，线程重新转入就绪状态。

死亡状态:
一个运行状态的线程完成任务或者其他终止条件发生时，该线程就切换到终止状态。

线程的优先级
每一个 Java 线程都有一个优先级，这样有助于操作系统确定线程的调度顺序。

Java 线程的优先级是一个整数，其取值范围是 1 （Thread.MIN_PRIORITY ） - 10 （Thread.MAX_PRIORITY ）。

默认情况下，每一个线程都会分配一个优先级 NORM_PRIORITY（5）。

具有较高优先级的线程对程序更重要，并且应该在低优先级的线程之前分配处理器资源。但是，线程优先级不能保证线程执行的顺序，而且非常依赖于平台。

创建一个线程
Java 提供了三种创建线程的方法：

通过实现 Runnable 接口；
通过继承 Thread 类本身；
通过 Callable 和 Future 创建线程。
通过实现 Runnable 接口来创建线程
创建一个线程，最简单的方法是创建一个实现 Runnable 接口的类。
随着计算机行业的飞速发展，摩尔定律逐渐失效，多核CPU成为主流。使用多线程并行计算逐渐成为开发人员提升服务器性能的基本武器。J.U.C提供的线程池：ThreadPoolExecutor类，帮助开发人员管理线程并方便地执行并行任务。了解并合理使用线程池，是一个开发人员必修的基本功。

本文开篇简述线程池概念和用途，接着结合线程池的源码，帮助读者领略线程池的设计思路，最后回归实践，通过案例讲述使用线程池遇到的问题，并给出了一种动态化线程池解决方案。

一、写在前面
1.1 线程池是什么
线程池（Thread Pool）是一种基于池化思想管理线程的工具，经常出现在多线程服务器中，如MySQL。

线程过多会带来额外的开销，其中包括创建销毁线程的开销、调度线程的开销等等，同时也降低了计算机的整体性能。线程池维护多个线程，等待监督管理者分配可并发执行的任务。这种做法，一方面避免了处理任务时创建销毁线程开销的代价，另一方面避免了线程数量膨胀导致的过分调度问题，保证了对内核的充分利用。

而本文描述线程池是JDK中提供的ThreadPoolExecutor类。

当然，使用线程池可以带来一系列好处：

降低资源消耗：通过池化技术重复利用已创建的线程，降低线程创建和销毁造成的损耗。
提高响应速度：任务到达时，无需等待线程创建即可立即执行。
提高线程的可管理性：线程是稀缺资源，如果无限制创建，不仅会消耗系统资源，还会因为线程的不合理分布导致资源调度失衡，降低系统的稳定性。使用线程池可以进行统一的分配、调优和监控。
提供更多更强大的功能：线程池具备可拓展性，允许开发人员向其中增加更多的功能。比如延时定时线程池ScheduledThreadPoolExecutor，就允许任务延期执行或定期执行。
1.2 线程池解决的问题是什么
线程池解决的核心问题就是资源管理问题。在并发环境下，系统不能够确定在任意时刻中，有多少任务需要执行，有多少资源需要投入。这种不确定性将带来以下若干问题：

频繁申请/销毁资源和调度资源，将带来额外的消耗，可能会非常巨大。
对资源无限申请缺少抑制手段，易引发系统资源耗尽的风险。
系统无法合理管理内部的资源分布，会降低系统的稳定性。
为解决资源分配这个问题，线程池采用了“池化”（Pooling）思想。池化，顾名思义，是为了最大化收益并最小化风险，而将资源统一在一起管理的一种思想。

Pooling is the grouping together of resources (assets, equipment, personnel, effort, etc.) for the purposes of maximizing advantage or minimizing risk to the users. The term is used in finance, computing and equipment management.——wikipedia

“池化”思想不仅仅能应用在计算机领域，在金融、设备、人员管理、工作管理等领域也有相关的应用。

在计算机领域中的表现为：统一管理IT资源，包括服务器、存储、和网络资源等等。通过共享资源，使用户在低投入中获益。除去线程池，还有其他比较典型的几种使用策略包括：

内存池(Memory Pooling)：预先申请内存，提升申请内存速度，减少内存碎片。
连接池(Connection Pooling)：预先申请数据库连接，提升申请连接的速度，降低系统的开销。
实例池(Object Pooling)：循环使用对象，减少资源在初始化和释放时的昂贵损耗。
ThreadPoolExecutor实现的顶层接口是Executor，顶层接口Executor提供了一种思想：将任务提交和任务执行进行解耦。用户无需关注如何创建线程，如何调度线程来执行任务，用户只需提供Runnable对象，将任务的运行逻辑提交到执行器(Executor)中，由Executor框架完成线程的调配和任务的执行部分。ExecutorService接口增加了一些能力：（1）扩充执行任务的能力，补充可以为一个或一批异步任务生成Future的方法；（2）提供了管控线程池的方法，比如停止线程池的运行。AbstractExecutorService则是上层的抽象类，将执行任务的流程串联了起来，保证下层的实现只需关注一个执行任务的方法即可。最下层的实现类ThreadPoolExecutor实现最复杂的运行部分，ThreadPoolExecutor将会一方面维护自身的生命周期，另一方面同时管理线程和任务，使两者良好的结合从而执行并行任务。
 */
//java的线程池
public class D {

    /**
     * 创建一个可以缓存的线程池
     */
    private static void ThreadPool() {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            executor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " " + index);

            });
        }
    }

    public static void main(String[] args) {
        ThreadPool();
        ThreadPoolA();
        createThreadPool();
    }

    /*
     * 创建一个固定大小的线程池，可控制并发的线程数，超出的线程会在队列中等待。
     */
    private static void ThreadPoolA() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            executor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " " + index);

            });
        }
    }
    // ThreadPoolExecutor类提供了4种构造方法，可根据需要来自定义一个线程池。
    /*
     * ThreadPoolExecutor类提供了4种构造方法，可根据需要来自定义一个线程池。
     * 
     * 复制代码
     * public ThreadPoolExecutor(int corePoolSize,
     * int maximumPoolSize,
     * long keepAliveTime,
     * TimeUnit unit,
     * BlockingQueue<Runnable> workQueue,
     * ThreadFactory threadFactory,
     * RejectedExecutionHandler handler) {
     * // 省略...
     * }
     * 复制代码
     * 1、共7个参数如下：
     * 
     * （1）corePoolSize：核心线程数，线程池中始终存活的线程数。
     * 
     * （2）maximumPoolSize: 最大线程数，线程池中允许的最大线程数。
     * 
     * （3）keepAliveTime: 存活时间，线程没有任务执行时最多保持多久时间会终止。
     * 
     * （4）unit: 单位，参数keepAliveTime的时间单位，7种可选。
     * 
     * 参数 描述
     * TimeUnit.DAYS 天
     * TimeUnit.HOURS 小时
     * TimeUnit.MINUTES 分
     * TimeUnit.SECONDS 秒
     * TimeUnit.MILLISECONDS 毫秒
     * TimeUnit.MICROSECONDS 微妙
     * TimeUnit.NANOSECONDS 纳秒
     * （5）workQueue: 一个阻塞队列，用来存储等待执行的任务，均为线程安全，7种可选。
     * 
     * 参数 描述
     * ArrayBlockingQueue 一个由数组结构组成的有界阻塞队列。
     * LinkedBlockingQueue 一个由链表结构组成的有界阻塞队列。
     * SynchronousQueue 一个不存储元素的阻塞队列，即直接提交给线程不保持它们。
     * PriorityBlockingQueue 一个支持优先级排序的无界阻塞队列。
     * DelayQueue 一个使用优先级队列实现的无界阻塞队列，只有在延迟期满时才能从中提取元素。
     * LinkedTransferQueue 一个由链表结构组成的无界阻塞队列。与SynchronousQueue类似，还含有非阻塞方法。
     * LinkedBlockingDeque 一个由链表结构组成的双向阻塞队列。
     * 较常用的是LinkedBlockingQueue和Synchronous。线程池的排队策略与BlockingQueue有关。
     * 
     * （6）threadFactory: 线程工厂，主要用来创建线程，默及正常优先级、非守护线程。
     * 
     * （7）handler：拒绝策略，拒绝处理任务时的策略，4种可选，默认为AbortPolicy。
     * 
     * 参数 描述
     * AbortPolicy 拒绝并抛出异常。
     * CallerRunsPolicy 重试提交当前的任务，即再次调用运行该任务的execute()方法。
     * DiscardOldestPolicy 抛弃队列头部（最旧）的一个任务，并执行当前任务。
     * DiscardPolicy 抛弃当前任务。
     * 
     * 
     * 2、顺便说下线程池的执行规则如下：
     * 
     * （1）当线程数小于核心线程数时，创建线程。
     * 
     * （2）当线程数大于等于核心线程数，且任务队列未满时，将任务放入任务队列。
     * 
     * （3）当线程数大于等于核心线程数，且任务队列已满：
     * 
     * 若线程数小于最大线程数，创建线程。
     * 
     * 若线程数等于最大线程数，抛出异常，拒绝任务。
     */
    /**
     * 
     */
    private static void createThreadPool() {
 ExecutorService executorService = new ThreadPoolExecutor(2, 10,1, TimeUnit.MINUTES, new ArrayBlockingQueue<>(5, true),Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
               for (int i = 0; i < 10; i++) {
                   final int index = i;
                    executorService.execute(() -> {
                   // 获取线程名称,默认格式:pool-1-thread-1
                 System.out.println(Thread.currentThread().getName() + " " + index);
                        // 等待2秒
                      
                 });
             }
            }
}
