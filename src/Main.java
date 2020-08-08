import java.util.Arrays;
import java.util.Iterator;

public class Main {


    public static void main(String[] args) {
        Integer[] array = {10,2,3,-4,5,6,88,8};
        Collection collection = new Collection(array);
        Iterator iteratorOne  = collection.createOne();
        System.out.println("Array: ");
        while (iteratorOne.hasNext()) {
            System.out.print(iteratorOne.next() + ",");
        }
        System.out.println();
        Iterator iteratorTwo  = collection.createTwo();
        System.out.println("Array: ");
        while (iteratorTwo.hasNext()) {
            System.out.print(iteratorTwo.next() + ",");
        }
        System.out.println();
        for(int i=0; i<array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        System.out.println("New array" + Arrays.toString(array));






    }
}
