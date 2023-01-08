package Final;

import java.util.HashMap;

public class B {
    /*
     * HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
     * 
     * HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。
     * 
     * HashMap 是无序的，即不会记录插入的顺序。
     * 
     * HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。
     * 
     */
    public static void main(String[] args) {
        HashMap<Integer, String> sites = new HashMap<Integer, String>();
        sites.put(1, "car");
        sites.put(2, "cat");
        // sites.get(key)
        System.out.println(sites);
        // sites.remove(4);
        // 删除所有键值对(key-value)可以使用 clear 方法： sites.clear()
        // 如果要计算 HashMap 中的元素数量可以使用 size() 方法：
        System.out.println(sites.get(1));
        for (int i = 1; i < sites.size() + 1; i++) {
            System.out.println(sites.get(i));
        }

        /*
         * 
         * for (Integer i : Sites.keySet()) {
         * System.out.println("key: " + i + " value: " + Sites.get(i));
         * }
         * // 返回所有 value 值
         * for(String value: Sites.values()) {
         * // 输出每一个value
         * System.out.print(value + ", ");
         * }
         * 
         * 
         */
        for (Integer i : sites.keySet()) {
            System.out.println(i);
        }

    }

}
