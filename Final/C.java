package Final;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Java Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法，可用于迭代 ArrayList 和 HashSet 等集合。
 *Iterator 是 Java 迭代器最简单的实现，ListIterator 是 Collection API 中的接口， 它扩展了 Iterator 接口。
 */
public class C {
  public static void main(String[] args) {
    ArrayList<String> l=new ArrayList<String>();
    l.add("beijing");
    l.add("shanghai");
    l.add("chengdu");
    l.add("guangzhuo");
    //使用迭代器遍历集合
    Iterator<String> i=l.iterator();
    while(i.hasNext())
    {
        System.out.println(i.next());
    }

  }

}
/*
 * Java Object 类是所有类的父类，也就是说 Java 的所有类都继承了 Object，子类可以使用 Object 的所有方法。



Object 类位于 java.lang 包中，编译时会自动导入，我们创建一个类时，如果没有明确继承一个父类，那么它就会自动继承 Object，成为 Object 的子类。

Object 类可以显式继承，也可以隐式继承，以下两种方式是一样的：
 */