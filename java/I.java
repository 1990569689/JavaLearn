public class I {
    // 空参构造
    private String student;
    private int age;

    public I() {

    }

    // 代参构造 创建对象的时候就给成员变量赋值
    public I(String student, int age) {
        this.student = student;
        this.age = age;
    }
}
