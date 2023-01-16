package Final;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        /*
         * ArrayList 类位于 java.util 包中，使用前需要引入它，语法格式如下：
         * 
         * import java.util.ArrayList; // 引入 ArrayList 类
         * 
         * ArrayList<E> objectName =new ArrayList<>(); // 初始化
         * E: 泛型数据类型，用于设置 objectName 的数据类型，只能为引用数据类型。
         * objectName: 对象名。
         * ArrayList 是一个数组队列，提供了相关的添加、删除、修改、遍历等功能。
         */
        ArrayList<String> string = new ArrayList<String>();
        string.add("Google");
        string.add("Runoob");
        string.add("Taobao");
        string.add("Weibo");
        // 修改方法
        string.set(1, "baidu");
        // 删除方法
        string.remove(0);
        // 计算大小
        string.size();
        System.out.println(string);
        System.out.println(string.get(0));
        // 迭代数组列表
        for (int i = 0; i < string.size(); i++) {
            System.out.println(string.get(i));
        }

    }

}
