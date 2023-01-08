package Io;

import java.io.File;

public class CreatDir {

    public static void main(String[] args) {
        String dir = "C:/Users/n/Desktop/Java学习源码/writer";
        File d = new File(dir);
        // 现在创建目录
        d.mkdirs();
    }
}