public class H {
    // java的封装
    // private只能在本类中访问
    // 标准的JavaBean类
    //// 属于封装思想
    private String student;
    private int age;

    public void setAge(int a) {
        if (a > 18) {
            age = a;
        } else {
            age = 18;
        }
    }

    public int getAge() {
        return age;
    }

    public void setStudent(String student) {
        // this关键字 把局部变量的student 传递为 成员的student变量
        this.student = student;
    }

    public String getStudent() {
        return student;
    }

}
