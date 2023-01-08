package Io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class readio {
    /*
     * Java.io 包几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标。
     * 
     * Java.io 包中的流支持很多种格式，比如：基本类型、对象、本地化字符集等等。
     * 
     * 一个流可以理解为一个数据的序列。输入流表示从一个源读取数据，输出流表示向一个目标写数据。
     * 
     * Java 为 I/O 提供了强大的而灵活的支持，使其更广泛地应用到文件传输和网络编程中。
     * 
     * 但本节讲述最基本的和流与 I/O 相关的功能。我们将通过一个个例子来学习这些功能。
     * Java 的控制台输入由 System.in 完成。
     * 
     * 为了获得一个绑定到控制台的字符流，你可以把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流。
     * 
     * 下面是创建 BufferedReader 的基本语法：
     * 
     * BufferedReader br = new BufferedReader(new
     * InputStreamReader(System.in));
     * BufferedReader 对象创建后，我们便可以使用 read() 方法从控制台读取一个字符，或者用 readLine() 方法读取一个字符串。
     */
    public static void main(String[] args) throws IOException {

        /*
         * 在此前已经介绍过，控制台的输出由 print( ) 和 println() 完成。这些方法都由类 PrintStream 定义，System.out
         * 是该类对象的一个引用。
         * 
         * PrintStream 继承了 OutputStream类，并且实现了方法 write()。这样，write() 也可以用来往控制台写操作。
         * 
         * PrintStream 定义 write() 的最简单格式如下所示：
         * 
         */
        /*
         * 提起计算机的存储空间，就会想到字节，也就是byte，毕竟我们最初学习课本知识的时候就接触到了。在java里byte也是整数类型的一种，
         * 跟short比占用空间只有它的一半，也算是排在基础内容前列的数据类型，下面就让我们一起学习byte相关的知识点，还是按照以往的学习模板。
         * 
         * 1.定义
         * 
         * 它是8位、有符号的、以二进制补码表示的整数。默认值为0，占用的空间只有int类型的四分之一。
         * 
         * 2.取值范围
         * 
         * -128～127（-2的7次方到2的7次方-1）
         * java中 byte[] b = new byte[1024];是指b中可以存1024个字节吗？
         * 
         * byte[] b = new byte[1024]
         * 这句话的意思就是说你先定义了一个byte类型的数组，数组长度为1024。也就是说你最多可以存1024个字节的东西，如果超过这个值就会报溢出的异常了
         * 如果要调用子类独有的方法的时候，直接用父类是没办法进行调用的，
         * 
         */
        // @第一种打开文件读取文件
        File f = new File("C:/Users/n/Desktop/Java学习源码/基础.txt");
        InputStream in = new FileInputStream(f);
        byte[] b = new byte[1024];
        // 转换后打印出来
        System.out.println(new String(b, 0, in.read(b), "UTF-8"));

        // 第二种
        File fi = new File("C:/Users/n/Desktop/Java学习源码/基础.txt");
        // 文件输出流
        FileInputStream fileinput = new FileInputStream(fi);
        // 把文件输出流写进流里面
        InputStreamReader inp = new InputStreamReader(fileinput, "UTF-8");
        // 用stringbuffer叠加
        int read;
        StringBuffer string = new StringBuffer();

        while ((read = inp.read()) != -1) {
            string.append((char) read);
            System.out.println(string);
        }
        // 第三种
        File file = new File("C:/Users/n/Desktop/Java学习源码/基础.txt");
        FileInputStream fil = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fil, "UTF-8");
        BufferedReader buff = new BufferedReader(input);
        String content;
        while ((content = buff.readLine()) != null) {
            System.out.println(content);
        }

    }

}
