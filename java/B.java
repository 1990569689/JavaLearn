public class B {
    //声明类变量
    public static int page = 100;
    public static int book = 2400;

    // 二种循环的运用
    public static void main(String[] args) {
        GetWhile(page, book);
        // while的无限循环语句
        while (true) {
            System.out.println(page);
        }
    }

    public static void GetWhile(int page, int book) {
        while (page < book) {

            page++;
        }
        System.out.println(page);
        // for 的无限循环
        for (;;) {
            System.out.println(page);
        }

    }

}
