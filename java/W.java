public class W {
    /*
     * Java 枚举(enum)
     * Java 枚举是一个特殊的类，一般表示一组常量，比如一年的 4 个季节，一个年的 12 个月份，一个星期的 7 天，方向有东南西北等。
     * 
     * Java 枚举类使用 enum 关键字来定义，各个常量使用逗号 , 来分割。
     * 内部类中使用枚举
     * 枚举类也可以声明在内部类中：
     */
    enum color {
        RED, GREEN, BLUE;
    }

    // 迭代枚举元素
    // 可以使用 for 语句来迭代枚举元素：
    public static void main(String[] args) {
        for (color my : color.values()) {
            System.out.println(my);
        }
        color c = color.BLUE;
        // 在 switch 中使用枚举类
        // 枚举类常应用于 switch 语句中：
        switch (c) {
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
        }

    }
    /*
     * enum 定义的枚举类默认继承了 java.lang.Enum 类，并实现了 java.lang.Serializable 和
     * java.lang.Comparable 两个接口。
     * 
     * values(), ordinal() 和 valueOf() 方法位于 java.lang.Enum 类中：
     * 
     * values() 返回枚举类中所有的值。
     * ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
     * valueOf()方法返回指定字符串值的枚举常量。
     * 枚举类成员
     * 枚举跟普通类一样可以用自己的变量、方法和构造函数，构造函数只能使用 private 访问修饰符，所以外部无法调用。
     * 
     * 枚举既可以包含具体方法，也可以包含抽象方法。 如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它。
     */
}

// 在外面的枚举
enum color {
    RED, GREEN, BLUE;

    // 构造方法必须是私有的
    private color() {

    }

    public void colorInfo() {

    }
}