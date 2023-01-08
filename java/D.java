public class D {
    public static void main(String[] args) {
        GetIntArray();
        GetStringArray();
    }

    // 数组的使用
    public static void GetIntArray() {
        // 数据类型[] 数组名=new 数据类型[]{元素1，元素2，....};
        // 简化 数据类型[] 数组名={元素1，元素2，....};
        int[] ArrayA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ArrayB = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // 输出地址
        System.out.println(ArrayA);
        // ArrayB[]从0开始
        System.out.println(ArrayB[0]);// 对应1

    }

    public static void GetStringArray() {
        // 数组的初始化
        // 创建一个string的数组长度为50
        String[] student = new String[50];
        // 50个数据
        /*
         * 数组的默认初始化规律
         * 整数：默认0
         * 小数：0.0
         * 字符类型：“/u0000”空格
         * 布尔类型：false
         * 引用数据类型null
         * 
         * 
         */
        String[] param = { "哥哥", "奶奶", "姐姐", "妈妈" };
        System.out.println(param[0]);
        // 数组的遍历
        for (int i = 0; i < param.length; i++) {
            System.out.println(param[i]);
        }
    }

}
