package Geeksforgeeks.SubsetOf;

import java.util.HashSet;

public class SubsetOf {
//    Given two arrays a[] and b[] of size m and n respectively, the task is to determine whether b[] is a subset of a[]. Both arrays are not sorted, and elements are distinct.
//
//    Examples:
//
//    Input: a[] = [11, 1, 13, 21, 3, 7], b[] = [11, 3, 7, 1]
//    Output: true
//
//    Input: a[]= [1, 2, 3, 4, 5, 6], b = [1, 2, 4]
//    Output: true
//
//    Input: a[] = [10, 5, 2, 23, 19], b = [19, 5, 3]
//    Output: false
    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1,145};
        boolean result = isSubset(a,b);
        boolean result2 = isSubset2(a,b);
        System.out.println(result);
        System.out.println(result2);
    }

    private static boolean isSubset(int[] a, int[] b) {
        HashSet<Integer> hsa = new HashSet<>();
        HashSet<Integer> hsb = new HashSet<>();
        boolean found = true;
        for (int num: a){
            hsa.add(num);
        }
        for (int num: b){
            hsb.add(num);
            if(!hsa.contains(num)) {
            return false;
            }
        }
        return found;

        }

    private static boolean isSubset2(int[] a, int[] b) {
        boolean counter = false;
        for (int i = 0; i < b.length; i++) {
             counter = false;
            for (int j = 0; j < a.length; j++) {
                if(b[i]==a[j]){
                    counter= true;
                    break;
                }
            }
            if(!counter){
                return false;
            }

        }
    return counter;
    }

}