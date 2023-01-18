public class O {
    public static String name;

    // 因为，非静态的变量是依赖于对象存在的，对象必须实例化之后，它的变量才会在内存中存在。
    // 变量没有定义static 则对象必须实例化时候变量才能加载到内存中
    // static定义的方法里面调用的变量必须是用static声明的静态变量,或者方法
    public void setName(String name) {
        this.name = name;
    }

    public  void getName() {
        System.out.println(name);
        //this.setAge();
        //不能调用会报错因为用static修饰的方法只能用static修饰的方法调用 当用static 修饰的变量可以用此方法调用
    }
    public static void setAge()
    {

    }

    public O(String name) {
        System.out.println(name);
    }

    public O() {

    }
}
