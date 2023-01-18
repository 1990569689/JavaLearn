public class F {
    /*
     * default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
     * 
     * private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
     * 
     * public : 对所有类可见。使用对象：类、接口、变量、方法
     * 
     * protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
     */
    // 通个G来处理
    // private私有关键字只能在本类中访问
    String student;
    // 没定义访问修饰符就是默认default
    private String lastName;

    int age;

    public void GetAge() {

    }

    public void GetStudent() {

    }
}
