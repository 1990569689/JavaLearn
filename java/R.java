public class R extends L {

    @Override
    public void GetName(String name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void SetName() {
        // TODO Auto-generated method stub

    }

    public void getString() {
        System.out.println("牛逼");
        // 对父类L方法getSting进行重写
    }

    public void Get() {
        super.getString();
        // 继承父类L的方法
    }

    public void get() {
        System.out.println("哈哈");
    }

    public static void main(String[] args) {
        R r = new R();
        r.get();
        r.Get();

    }

}
