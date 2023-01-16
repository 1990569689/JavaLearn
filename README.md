#Java教程
>java文件

**S.java和T.java**文件是对Java变量类型的介绍
局部变量：类的方法中的变量。
静态变量（或称为类变量），指被 static 修饰的成员变量。
实例变量，指没有被 static 修饰的成员变量。
![](Java/T.png)
**A.java**文件是对switch case的两种方法的介绍
![](Java/A.png)
**B.java**文件是对无限循环while for的运用
![](java/B.png)
**C.java**文件是对循环for的运用
![](java/C.png)
**D.java**文件是对数组的运用
![](java/D.png)
**E.java**文件是对类的构造方法的解释运用
![](java/E.png)
**F.java**文件是对类与类的调用的学习
![](java/F.png)
**H.java**文件是对javaBean（Java封装）的的运用以及this关键字的解释
![](java/H.png)
**I.java**文件是对空参构造以及带参构造的运用
![](java/I.png)
**J.java**文件是对接口的定义
![](java/J.png)
**K.java**文件是调用接口的运用
![](java/K.png)
**L.java**文件是对创建一个抽象类的运用
![](java/L.png)
**M.java**文件是对Java继承的相关解释
![](java/M.png)
**N.java**文件是对继承中super的运用
![](java/N.png)
**O.java**定义一个可以用于继承的类文件
![](java/O.png)
**Q.java**文件是对接口中抽象类的相关解释
![](java/Q.png)
**T.java**文件是对**S.java**文件中变量的相关运用
![](java/T.png)
**U.java**是对Java中StringBuffer和StringBuilder的相关解释
![](java/U.png)

>Final文件夹

**A.java**文件ArrayList的相关用法ArrayList 类是一个可以动态修改的数组，与普通数组的区别就是它是没有固定大小的限制，我们可以添加或删除元素。

ArrayList 继承了 AbstractList ，并实现了 List 接口。
![](Final/ArrayList.png)
####添加元素
ArrayList 类提供了很多有用的方法，添加元素到 ArrayList 可以使用 add() 方法:
####访问元素
访问 ArrayList 中的元素可以使用 get() 方法：
####访问元素
访问 ArrayList 中的元素可以使用 get() 方法：
####删除元素
如果要删除 ArrayList 中的元素可以使用 remove() 方法：
####删除元素
如果要删除 ArrayList 中的元素可以使用 remove() 方法：
####ArrayList 排序
Collections 类也是一个非常有用的类，位于 java.util 包中，提供的 sort() 方法可以对字符或数字列表进行排序。
以下实例对字母进行排序：
####迭代数组列表
我们可以使用 for 来迭代数组列表中的元素：
也可以使用 for-each 来迭代元素：
如果我们要存储其他类型，而 <E> 只能为引用数据类型，这时我们就需要使用到基本类型的包装类。
基本类型对应的包装类表如下：
![](Final/data_1.png)
**B.java**文件是HashMap的基础用法
HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。
HashMap 是无序的，即不会记录插入的顺序。
HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。
![](Final/hashmap.png)
HashMap 的 key 与 value 类型可以相同也可以不同，可以是字符串（String）类型的 key 和 value，也可以是整型（Integer）的 key 和字符串（String）类型的 value。
HashMap 中的元素实际上是对象，一些常见的基本类型可以使用它的包装类。
基本类型对应的包装类表如下：
![](Final/data_1.png)
HashMap 类位于 java.util 包中，使用前需要引入它，语法格式如下：
import java.util.HashMap; // 引入 HashMap 类
以下实例我们创建一个 HashMap 对象 Sites， 整型（Integer）的 key 和字符串（String）类型的 value：
HashMap<Integer, String> Sites = new HashMap<Integer, String>();
####添加元素
HashMap 类提供了很多有用的方法，添加键值对(key-value)可以使用 put() 方法:
####访问元素
我们可以使用 get(key) 方法来获取 key 对应的 value:
####删除元素
我们可以使用 remove(key) 方法来删除 key 对应的键值对(key-value):
####计算大小
如果要计算 HashMap 中的元素数量可以使用 size() 方法：
####迭代 HashMap
可以使用 for-each 来迭代 HashMap 中的元素。
如果你只想获取 key，可以使用 keySet() 方法，然后可以通过 get(key) 获取对应的 value，如果你只想获取 value，可以使用 values() 方法。

**C.java**文件是对迭代器的运用
![](Final/Iterator.jpg)
Java Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法，可用于迭代 ArrayList 和 HashSet 等集合。
Iterator 是 Java 迭代器最简单的实现，ListIterator 是 Collection API 中的接口， 它扩展了 Iterator 接口。
迭代器 it 的两个基本操作是 next 、hasNext 和 remove。
调用 it.next() 会返回迭代器的下一个元素，并且更新迭代器的状态。
调用 it.hasNext() 用于检测集合中是否还有元素。
调用 it.remove() 将迭代器返回的元素删除。
####获取一个迭代器
集合想获取一个迭代器可以使用 iterator() 方法:
####循环集合元素
让迭代器 it 逐个返回集合中所有元素最简单的方法是使用 while 循环：
```
while(it.hasNext()) {
    System.out.println(it.next());
}
```
####删除元素
要删除集合中的元素可以使用 remove() 方法。

>Io文件夹

IO流相关操作
![](Io/iostream.png)
CreatDir.java文件 即里面有创建文件夹的代码 解释齐全
![](Io/CreatDir.png)
DirList.java文件，即里面含有Java遍历文件夹代码，且可判定后缀
![](Io/DirList.png)
readio.java文件，即含有Java读取文件代码，并且提供了4种方式
![](Io/readio.png)
writer.java文件，即含有Java写文件代码，并且也提供了4种方式
![](Io/writer.png)


>socket文件夹
