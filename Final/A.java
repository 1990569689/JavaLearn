package Final;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
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



