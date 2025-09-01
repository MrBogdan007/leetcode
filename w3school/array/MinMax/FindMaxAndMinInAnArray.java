package w3resource.array.MinMax;

import arrays.IntArrayWrapper;

import java.util.Arrays;

//Write a Java program to find the maximum and minimum value of an array.
public class FindMaxAndMinInAnArray {
    public static void main(String[] args) {
        IntArrayWrapper wrapper = new IntArrayWrapper();
        System.out.println(wrapper);
        findMinMax(wrapper.getValues());
    }

    private static void findMinMax(int[] values) {
        Arrays.sort(values);
        System.out.println("Min: " + values[0] + " Max: " + values[values.length - 1]);
    }
}
