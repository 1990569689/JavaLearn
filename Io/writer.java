package Io;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class writer {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // 第一种
        File f = new File("C:/Users/n/Desktop/Java学习源码/writer.txt");
        OutputStream fo = new FileOutputStream(f);
        byte[] bytes = { 1, 2, 3, 4, 5, 10 };
        for (int i = 0; i < bytes.length; i++) {
            fo.write(bytes[i]);
            fo.close();
        }
        // 第二种
        File file = new File("C:/Users/n/Desktop/Java学习源码/writer.txt");
        FileOutputStream fileout = new FileOutputStream(file);
        OutputStreamWriter out = new OutputStreamWriter(fileout, "UTF-8");
        // 将数据写入缓冲区
        out.append("测试");
        // 刷新缓冲区同时写入内容
        out.close();
        fileout.close();
        // 第三种
        File fil = new File("C:/Users/n/Desktop/Java学习源码/writer.txt");
        FileOutputStream output = new FileOutputStream(fil);
        OutputStreamWriter outwriter = new OutputStreamWriter(output, "UTF-8");
        BufferedWriter buff = new BufferedWriter(outwriter);
        buff.append("你好");
        buff.close();
        // 第四种
        File filee = new File("C:/Users/n/Desktop/Java学习源码/writer.txt");
        FileWriter fw = new FileWriter(filee);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("你好");
        bw.close();
    }

}