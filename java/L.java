public abstract class L {
    // 新建了一个抽象类
    /*
     * 
     * 
     * 在面向对象的概念中，所有的对象都是通过类来描绘的，但是反过来，并不是所有的类都是用来描绘对象的，如果一个类中没有包含足够的信息来描绘一个具体的对象，
     * 这样的类就是抽象类。
     * 
     * 抽象类除了不能实例化对象之外，类的其它功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。
     * 
     * 由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。也是因为这个原因，通常在设计阶段决定要不要设计抽象类。
     * 
     * 父类包含了子类集合的常见的方法，但是由于父类本身是抽象的，所以不能使用这些方法。
     * 
     * 在 Java 中抽象类表示的是一种继承关系，一个类只能继承一个抽象类，而一个类却可以实现多个接口
     * 
     * 
     */

    // 抽象方法
    public abstract void GetName(String name);

    public abstract void SetName();

    // 方法
    public String string(String name) {
        return name;
    }

    public void getString() {
        System.out.println("获得字符串");
    }
    // 抽象类必须继承，不能实例化对象
}
