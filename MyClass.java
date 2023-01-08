public class MyClass {

    public static void Getname(String java) {
        System.out.println(java);
    }

    public static int GetJava(int name) {
        return name;
    }

    public MyClass() {

    }

    public MyClass(String name, String age) {
        System.out.println(name + age);
    }

    public static void main(String[] args) {

        MyClass my = new MyClass("你好", "世界");
        my.Getname("你好");
    }
}