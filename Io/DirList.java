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
                    // file.delete()删除文件 用于递归删除空目录
                    // file.exists()判断文件是否存在
                    // oldName.renameTo(newName)重命名文件
                    // Long lastModified = file.lastModified(); Date date = new Date(lastModified);
                    // System.out.println(date);获取文件修改时间
                    // file.createNewFile()创建文件
                    /*递归创建文件
                     * String directories = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
                     * File file = new File(directories);
                     * boolean result = file.mkdirs();
                     */
                    //  long size = FileUtils.sizeOfDirectory(new File("C:/test"));获取目录大小
                    System.out.println(type);
                    System.out.println(list[i] + "是" + type + "文件");

                }

            }
        }

    }
}
