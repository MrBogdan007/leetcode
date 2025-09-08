package Leetcode.arrays;

import java.util.Arrays;

public class PlusOne {
    public static int[]  plusOne(int[] digits) {


        for (int i = digits.length -1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return digits;
            }
            digits[i] = 0;
            System.out.println(Arrays.toString(digits));
        }
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        System.out.println("here "+Arrays.toString(newArray));
        return newArray;
    }
}
