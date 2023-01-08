import java.text.SimpleDateFormat;
import java.util.Date;

public class A {
    /*
     * 第一个Java程序
     * 它将输出字符串 Hello World
     */
    public static void main(String[] args) {
        // 数组类型[] 数组名=new {"小白","小明"};
        /*
         * int[] age = { 1, 2, 9, 3, 4, 5, 6, 7, 8 };
         * String[] name = { "小明", "小白" };
         * System.out.println(age[0]);
         * System.out.println(name[0]);
         */
        /*
         * StringBuilder sb = new StringBuilder();
         * sb.append("我是");
         * sb.append("你们");
         * sb.append("管理员");
         * System.out.println(sb);
         */
        Date date = new Date();
        SimpleDateFormat sp = new SimpleDateFormat("y-M-d h:m:s ");

        System.out.println(date.toString());
        System.out.println(sp.format(date));

    }
}