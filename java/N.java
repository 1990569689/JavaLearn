public class N extends O {
    // 继承父类O的方法
    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public void getName() {
        // TODO Auto-generated method stub
        super.getName();
    }

    public N() {
        // 当前构造器继承父类o的构造用super
        super("小明");
    }

    public static void main(String[] args) {
        N m = new N();
        m.setName("小明");
        m.getName();

    }
}
