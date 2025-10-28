package Geeksforgeeks.TwoPointerProblems;

import java.util.Arrays;

public class MoveZeroesToEnd {
//    Given an array of integers arr[], move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
//
//    Examples:
//
//    Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//    Output: [1, 2, 4, 3, 5, 0, 0, 0]
//    Explanation: There are three 0s that are moved to the end.
//
//            Input: arr[] = [10, 20, 30]
//    Output: [10, 20, 30]
//    Explanation: No change in array as there are no 0s.
//
//            Input: arr[] = [0, 0]
//    Output: [0, 0]
//    Explanation: No change in array as there are all 0s.
    public static void main(String[] args) {
        moveZeroes(new int[]{1, 2, 0, 4, 3, 0, 5, 0});
    }

    private static void moveZeroes(int[] ints) {
        Arrays.sort(ints);
        int writeIndex = 0;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]!=0){
                //writeIndex++ use current element, then advance
                ints[writeIndex++] = ints[i];
            }
        }
        while (writeIndex < ints.length){
            ints[writeIndex++] = 0;
        }
        for (int num: ints){
            System.out.println(num);
        }
    }
}
