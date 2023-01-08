public class K implements J, Q {
    // 实现接口，需要实现里面的抽象方法
    // Java实现J接口
    public void GetName() {
        // TODO Auto-generated method stub
        System.out.println("名字");
    }

    /*
     * (non-Javadoc)
     * 
     * @see J#SetName()
     */
    @Override
    public void SetName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        K k = new K();
        k.GetName();
        k.SetName("小明");
        k.setName("小明");
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void getName() {
        // TODO Auto-generated method stub

    }

    @Override
    public void setAge(int age) {
        // TODO Auto-generated method stub

    }

    @Override
    public void getAge() {
        // TODO Auto-generated method stub

    }
}
