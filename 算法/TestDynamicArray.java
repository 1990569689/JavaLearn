public class TestDynamicArray {
    public static void main(String[] args) {
       
test();
    }
    public static void test() {
            
        
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addList(0);
        dynamicArray.addList(1);
        dynamicArray.addList(2);
        dynamicArray.addList(3);
        dynamicArray.addList(4);
        for (Integer element : dynamicArray) {
            System.out.println(element);
        }
    }
    public static void test2() {
            
        
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addList(0);
        dynamicArray.addList(1);
        dynamicArray.addList(2);
        dynamicArray.addList(3);
        dynamicArray.addList(4);
        dynamicArray.stream().forEach(element->{
            System.out.println(element);
        });;
    }

}
