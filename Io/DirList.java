package Io;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        File f = new File("C:/Users/n/Desktop/Java学习源码");
        if (f.isDirectory()) {
            System.out.println("目录： java");
            String[] list = f.list();

            for (int i = 0; i < list.length; i++) {
                File file = new File("C:/Users/n/Desktop/Java学习源码/" + list[i]);
                if (file.isDirectory()) {
                    System.out.println(list[i] + "是目录");
                } else {
                    String type = list[i].substring(list[i].indexOf(".") + 1);




                    System.out.println(type);
                    System.out.println(list[i] + "是文件");

                }

            }
        }

    }
}
