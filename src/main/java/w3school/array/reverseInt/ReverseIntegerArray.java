package w3school.array.reverseInt;

import java.util.Arrays;

public class ReverseIntegerArray {
//Write a Java program to reverse an array of integer values.

    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };
        reverseInt(my_array1);
    }

    private static void reverseInt(int[] myArray1) {
    int[] arr  = new int[myArray1.length];
    int j = 0;
        for (int i = myArray1.length-1; i >= 0 ; i--) {
            arr[j] = myArray1[i];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
