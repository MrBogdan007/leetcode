package w3resource.array.InsertArray;

import arrays.IntArrayWrapper;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InsertElement {
    public static void main(String[] args) {
        IntArrayWrapper arr = new IntArrayWrapper();
        System.out.println(arr);
        insertElement(arr.getValues(),25,  3);
        int x = 42;


    }

    private static void insertElement(int[] arr, int element, int index) {
        String delimiter = ", ";
        String prefix = "[";
        String suffix = "]";
        for (int i = 0; i < arr.length; i++) {
            if(i == index){
                arr[i]=element;
            }
        }
        System.out.println(Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(delimiter,prefix,suffix)));
    }
}
