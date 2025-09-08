package w3school.array;

import java.util.HashSet;
import java.util.Set;

//Write a Java program to test if an array contains a specific value.
public class ContainsValue {
    public static void main(String[] args) {
//        System.out.println(containValue(new int[]{1,3,4,2,8,5,1},2));
//        System.out.println(containValueTwoPointer(new int[]{1,3,4,2,8,5},2));
//        System.out.println(containValueOfAnotherArray(new int[]{1,3,4,2,8,5},new int[]{1,3,4,2,8,5}));
//        System.out.println(containUnique(new int[]{1,3,4,2,8,5,1}));
        System.out.println(containOneNegative(new int[]{1,3,4,2,8,5,1,-1}));

    }

    private static boolean containOneNegative(int[] arr) {
       for (int single: arr){
           if(single<0){
               return true;
           }
       }
       return false;
    }
    private static boolean containUnique(int[] arr) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int i: arr){
            uniqueSet.add(i);
        }
        System.out.println(uniqueSet.size());
        System.out.println(arr.length);
        for (int value: uniqueSet){
            System.out.println(value);
        }
        if(uniqueSet.size()!=arr.length){
            return false;
        }
        return true;
    }

    private static boolean containValueOfAnotherArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    private static boolean containValueTwoPointer(int[] arr, int value) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            if(arr[start]==value || arr[end]==value){
                return true;
            }else if(arr[start]<value){
                start++;

            }else{
                end--;
            }
        }
        return false;
    }

    public static boolean containValue(int [] arr, int value){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }
    
}
