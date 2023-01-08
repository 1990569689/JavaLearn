public class T {
    public static void main(String[] args) {
        System.out.println(S.name);
        //直接用类名调用它的全局变量（类变量/静态变量）
        S s=new S();
        //实例化对象来调用实例变量
        System.out.println(s.age);
        
    }
}
