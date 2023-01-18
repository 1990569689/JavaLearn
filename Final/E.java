package Final;

import java.util.LinkedList;

public class E {
    /*
     * 链表（Linked list）是一种常见的基础数据结构，是一种线性表，但是并不会按线性的顺序存储数据，而是在每一个节点里存到下一个节点的地址。
     * 链表可分为单向链表和双向链表。
     * 一个单向链表包含两个值: 当前节点的值和一个指向下一个节点的链接。
     * 一个双向链表有三个整数值: 数值、向后的节点链接、向前的节点链接。
     * Java LinkedList（链表） 类似于 ArrayList，是一种常用的数据容器。
     * 与 ArrayList 相比，LinkedList 的增加和删除的操作效率更高，而查找和修改的操作效率较低。
     * 以下情况使用 ArrayList :
     * 频繁访问列表中的某一个元素。
     * 只需要在列表末尾进行添加和删除元素操作。
     * 以下情况使用 LinkedList :
     * 你需要通过循环迭代来访问列表中的某些元素。
     * 需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
     * LinkedList 继承了 AbstractSequentialList 类。
     * LinkedList 实现了 Queue 接口，可作为队列使用。
     * LinkedList 实现了 List 接口，可进行列表的相关操作。
     * LinkedList 实现了 Deque 接口，可作为队列使用。
     * LinkedList 实现了 Cloneable 接口，可实现克隆。
     * LinkedList 实现了 java.io.Serializable 接口，即可支持序列化，能通过序列化去传输。
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Google");
        list.add("baidu");
        // 使用 addFirst() 在头部添加元素
        list.addFirst("zhihu");
        // addLast()在结尾添加元素
        list.addLast("360");
        // removeFirst()移除开头元素
        list.removeFirst();
        // removeLast()移除结尾元素
        list.removeLast();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        // getFrist()获取开头
        // getLast()获取结尾
        //通过for和size来迭代元素
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        //也可以使用 for-each 来迭代元素：
        for(String i:list)
        {
          System.out.println(i);
        }
    }
}
