public class C {
    public static void main(String[] args) {

        GetFor();
    }

    // continue的运用 跳过第3
    public static void GetFor() {

        for (int i = 0; i < 5; i++) {
            // 第3不执行继续执行
            if (i == 3) {
                continue;
            }
            System.out.println("第" + i);
        }
    }
}
