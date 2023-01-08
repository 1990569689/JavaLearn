public class G {
    public static void main(String[] args) {
        // 创建一F个对象
        F f = new F();
        f.age = 18;
        f.student = "小妹";
        System.out.println(f.age);
        // H的封装
        H h = new H();
        h.setAge(19);
        h.setStudent("小妹");
        System.out.println(h.getAge());
        System.out.println(h.getStudent());
    }
}
