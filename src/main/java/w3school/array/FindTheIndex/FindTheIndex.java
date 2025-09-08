package w3school.array.FindTheIndex;

import java.util.Arrays;

public class FindTheIndex {
    public static void main (String[] args) {
        System.out.println(findIndex(Arrays.stream(new int[]{1, 2, 32, 1, 6, 1}).sorted().toArray(), 32));
        System.out.println(findIndexTwoPointer(Arrays.stream(new int[]{1, 2, 32, 1, 6, 1}).sorted().toArray(), 32));
        System.out.println(findIndexTwoPointer(Arrays.stream(new int[]{1, 2, 32, 1, 6, 1}).sorted().toArray(), 32));
        findIndexMaxElement(Arrays.stream(new int[]{1, 2, 32, 1, 6, 1}).sorted().toArray());
    }
    public static int findIndex(int[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                return i;
            }
        }
        return 0;
    }
    public static int findIndexTwoPointer(int[] arr, int element){
        System.out.println(arr[2]);
       int start = 0;
       int end = arr.length-1;
       while (start<end){
           if(arr[end]==element){
               return end;
           }else if(arr[start] == element){
               return start;
           }
           start ++;
            end --;

       }
       return 0;
    }
    public static void findIndexMaxElement(int[] arr){
        System.out.println(arr.length-1);
    }

}
