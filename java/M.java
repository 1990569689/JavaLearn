public class M extends L {
    public String name;

    // Java的继承
    @Override
    public void GetName(String name) {
        // TODO Auto-generated method stub
        this.name = name;

    }

    @Override
    public void SetName() {
        // TODO Auto-generated method stub
        System.out.println(name);

    }

    public static void main(String[] args) {
        M m = new M();
        m.GetName("小明");
        m.SetName();
        System.out.println(m.string("牛逼"));
    }

}
