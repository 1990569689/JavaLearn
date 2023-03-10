public class S {
    // 类变量/静态变量static的目的
    // java中的static关键字主要用于内存管理。
    /*
     * 使用范围：java static关键字可以用在变量、方法、代码块和嵌套类伤。
     * 
     * 作用范围：static关键字属于类，而不是类的实例。
     * 
     * 静态(static)修饰如下：
     * 
     * 变量：称为类变量、静态变量
     * 方法：称为类方法、静态方法
     * 代码块：称为静态代码块
     * 嵌套类：称为静态内部类
     * 类的成员变量可以分为以下两种：
     * 
     * 静态变量（或称为类变量），指被 static 修饰的成员变量。
     * 实例变量，指没有被 static 修饰的成员变量。
     * 静态变量与实例变量的区别如下：
     * 1）静态变量
     * 
     * 运行时，Java 虚拟机只为静态变量分配一次内存，加载类过程中完成静态变量的内存分配。
     * 在类的内部，可以在任何方法内直接访问静态变量。
     * 在其他类中，可以通过类名访问该类中的静态变量。
     * 2）实例变量
     * 
     * 每创建一个实例，Java 虚拟机就会为实例变量分配一次内存。
     * 在类的内部，可以在非静态方法中直接访问实例变量。
     * 在本类的静态方法或其他类中则需要通过类的实例对象进行访问。
     * 静态变量在类中的作用如下：
     * 
     * 静态变量可以被类的所有实例共享，因此静态变量可以作为实例之间的共享数据，增加实例之间的交互性。
     * 如果类的所有实例都包含一个相同的常量属性，则可以把这个属性定义为静态常量类型，从而节省内存空间。例如，在类中定义一个静态常量 PI。
     * 静态变量的好处：它能使程序存储器高效(即它节省内存)。
     */
    static String name = "D东ing";
    // 创建了一个类的静态变量即全局变量
    // 在本类中任意一个方法或者地方都可以访问，且其他类可以调用
    // 可以加上访问修饰符pubilc private
    String age = "18";

    // 实例变量和类变量都称为成员变量
    // 实例变量：独立于方法之外的变量，不过没有 static 修饰
    // 可以加上访问修饰符pubilc private
    /*
     * 静态变量：成员变量的一种，定义在类中方法外，用static修饰，在JVM中属于方法区，声明时有默认的初始化值。
     * 实例变量：成员变量的一种，定义在类中方法外，在JVM中属于方堆中，声明时有默认的初始化值。
     * 局部变量：定义在类中方法中，在JVM中属于栈中，声明时没有默认的初始值，初始化时必须手动赋值。
     * 静态变量和局部变量都属于成员变量，那么如何选择合适的类型呢？下面就来谈一下这两者的区别和使用方法。
     * 静态变量，顾名思义就是静止不变的变量，在对象中对于同一个成员变量的数值都一样时，例如定义一个中国人类，每个人的国籍都是中国，就没必要每一个对象中存一份，
     * 这样就可以把数据抽离出来将其用静态变量表示，用static修饰。
     * 调用方式：
     * 实例变量只能通过对象名调用，静态变量可以使用类名调用，也可以使用对象名调用，但是不推荐使用对象名调用。
     */

    public void getAge() {
        /*
         * 局部变量声明在方法、构造方法或者语句块中；
         * 局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
         * 访问修饰符不能用于局部变量；
         * 局部变量只在声明它的方法、构造方法或者语句块中可见；
         * 局部变量是在栈上分配的。
         * 局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
         */
        String person = "一个";
    }

}
