package w3school.array.CopyArray;



import Leetcode.arrays.IntArrayWrapper;

import java.util.Arrays;

public class AlternateElements {
    public static void main(String[] args) {
        IntArrayWrapper arr = new IntArrayWrapper();
        System.out.println(arr);
        copyAlternate(arr.getValues());
    }
    public static void copyAlternate(int[] arr){
        System.out.println(Math.ceil((double) 7/2));
        int [] newArray = new int[(int) Math.ceil((double) arr.length/2)];
        int j =0;
        for (int i = 0; i < arr.length; i+=2) {

            newArray[j] = arr[i];
            j++;

        }
        System.out.println(Arrays.toString(newArray));
    }

}
