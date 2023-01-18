
public class N extends O {
    /*
     * 子类拥有父类非 private 的属性、方法。
     * 
     * 子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
     * 
     * 子类可以用自己的方式实现父类的方法。
     * 
     * Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 B 类继承 A 类，C 类继承 B
     * 类，所以按照关系就是 B 类是 C 类的父类，A 类是 B 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。
     * 
     * 提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。
     */
    // 对父类的方法重写

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }
//在静态static定义的方法中不能使用this和super
    public  void get() {
        // TODO Auto-generated method stub
        super.getName();
        // 调用父类中的getName()方法
        this.getName();
        this.age();
        // 调用本类中的getName()方法
    }
    public void age()
    {

    }
     //对父类方法的重写
    
    public   void getName() {
        System.out.println("本类调用");
        
        
    }
    //对父类方法的重载
    public  void getName(String name) {
        System.out.println("本类调用");
        
        
    }


    public N(String name) {
        // 当前构造器继承父类o的构造用super
        // super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。
        // 构造器
        /*
         * 子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super
         * 关键字调用父类的构造器并配以适当的参数列表。
         * 
         * 如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器
         */
        super(name);
        // 因为
    }

    public N() {

    }

    public static void main(String[] args) {
        N m = new N("你好");
        m.setName("小明");
        m.getName();

    }
    /*
     * final 关键字
     * final 可以用来修饰变量（包括类属性、对象属性、局部变量和形参）、方法（包括类方法和对象方法）和类。
     * 
     * final 含义为 "最终的"。
     * 
     * 使用 final 关键字声明类，就是把类定义定义为最终类，不能被继承，或者用于修饰方法，该方法不能被子类重写：
     * 声明类：
     * 
     * final class 类名 {//类体}
     * 声明方法：
     * 
     * 修饰符(public/private/default/protected) final 返回值类型 方法名(){//方法体}
     * this不存在static里面
     */
}
