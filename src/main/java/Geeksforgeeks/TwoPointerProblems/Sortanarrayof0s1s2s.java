package Geeksforgeeks.TwoPointerProblems;

import java.util.Arrays;

public class Sortanarrayof0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
//        sort012(arr);
        sortt012(arr);
    }

    private static void sort012(int[] arr) {
        Arrays.sort(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    private static void sortt012(int[] arr) {
        int b0 = 0, b1 = 0, b2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                b0++;
            } else if (arr[i] == 1) {
                b1++;
            } else {
                b2++;
            }
        }
        int writeIndex = 0;

        for (int i = 0; i < b0; i++) {
            arr[writeIndex++] = 0;
        }


        for (int i = 0; i < b1; i++) {
            arr[writeIndex++] = 1;
        }
        for (int i = 0; i < b2; i++) {
            arr[writeIndex++] = 2;
        }
        for (int n : arr) {

            System.out.print(n + " ");
        }
    }
}
