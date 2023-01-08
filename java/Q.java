public interface Q {
    public String name = "小明";
    /**
     * 接口不能用于实例化对象。
     * 接口没有构造方法。
     * 接口中所有的方法必须是抽象方法，Java 8 之后 接口中可以使用 default 关键字修饰的非抽象方法。
     * 接口不能包含成员变量，除了 static 和 final 变量。
     * 接口不是被类继承了，而是要被类实现。
     * 接口支持多继承
     */
    public int age = 18;

    // 接口的没有方法体
    public void setName(String name);

    public void getName();

    public void setAge(int age);

    public void getAge();

}
