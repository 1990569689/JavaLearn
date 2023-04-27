import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DynamicArray implements Iterable<Integer> {
    public static int size = 0;
    public static int capacity = 8;
    public static int[] array = new int[capacity];

    public static void main(String[] args) {

    }

    public static void addList(int element) {
        array[size] = element;
        size++;

    }

    public static void add(int index, int element) {
        if (index >= 0 && index < size) {

            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = element;
            size++;
        } else if (index == size) {
            array[size] = element;
            size++;
        }
    }

    public static void foreach(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
            consumer.accept(array[i]);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
   
        // TODO Auto-generated method stub
        return new Iterator<Integer>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                // 询问有没有下一个元素
                return i < size;
            }

            @Override
            public Integer next() {
                // TODO Auto-generated method stub
                // 返回当前元素，指针移动到下一个元素
                return array[i++];
            }

        };
    }
    public IntStream stream()
    {
        return IntStream.of(Arrays.copyOfRange(array,0,size));
    }
}
