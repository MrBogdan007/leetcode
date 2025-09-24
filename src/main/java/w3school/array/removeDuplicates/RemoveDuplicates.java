package w3school.array.removeDuplicates;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    //Write a Java program to remove duplicate elements from an array.
    //Write a Java program to remove duplicates from an array without using a HashSet
    public static void main(String[] args) {
        // Call the unique_array method with two different sets of input arrays.
        unique_array(new int[]{0, 3, -2, 4, 3, 2});
        unique_array(new int[]{10, 22, 10, 20, 11, 22});
        unique_array2(new int[]{10, 22, 10, 20, 11, 22});

        int [] arr = new int[]{10, 22, 10, 20, 11, 22};
      int newLength =   removeDuplicate(arr);
        for (int i = 0; i < newLength; i++) {
            System.out.println("Unique elements two pointer: " + arr[i]);
        }
    }

    private static int removeDuplicate(int[] ints) {
        Arrays.sort(ints);
        if(ints.length == 0){
            return 0 ;
        }
        int j = 0; // second pointer startion from index 0
        for (int i = 1; i < ints.length; i++) { //first pointer starting from index 1
            //going in parallel
            if(ints[i]!=ints[j]){
                j++;
                ints[j] = ints[i];
            }
        }
        return j+1;
    }

    private static void unique_array2(int[] ints) {
        HashSet<Integer> uniqArr = new HashSet<>();
        for (int num: ints){
            uniqArr.add(num);
        }
        System.out.println(uniqArr);
    }


    private static void unique_array(int[] ints) {
        // first storing uniques
        // then checking if i is same as unique that is already in array
        // parallel checking 2 arrays
        int[] uniqueArray = new int[ints.length];
        int counter = 0;

        for (int i = 0; i < ints.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < counter; j++) { // check only stored uniques
                if (ints[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[counter++] = ints[i];
            }
        }
        uniqueArray = Arrays.copyOf(uniqueArray, counter);
        System.out.println(Arrays.toString(uniqueArray));

    }

}