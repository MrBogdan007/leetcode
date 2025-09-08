package w3school.array.removeElementFromArray;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        removeElement(new int[]{3,3,6,7,25},3);
        removeElement2(new int[]{3,3,6,7,25},3);
        removeElement3();
        removeEverySecondElement(new int[]{3,3,6,7,25});
    }

    private static void removeElement(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                count++;
            }
        }
        int [] newArr = new int[arr.length-count];
        int j = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] !=value){
                newArr[j] = arr[i];
                j++; // move newArr index forward only when we add something
            }
        }
        for (int single: newArr){
            System.out.println(single);
        }
    }
    private static void removeEverySecondElement(int[] arr) {
        int count = arr.length/2;


        int [] newArr = new int[arr.length-count];
        int j = 0;
        for (int i = 0; i < arr.length ; i+=2) {
                newArr[j] = arr[i];
                j++; // move newArr index forward only when we add something

        }
        System.out.println(Arrays.toString(newArr));

    }
    private static void removeElement2(int[] arr, int value) {
        int removeIndex = 1;
        arr[removeIndex] = arr[removeIndex + 1];
        System.out.println(Arrays.toString(arr));
    }
    private static void removeElement3() {
        int[] my_array = {3, 3, 56, 15, 36, 56, 77, 18, 29, 49};

        // Print the original array using Arrays.toString() method.
        System.out.println("Original Array : " + Arrays.toString(my_array));

        // Define the index of the element to be removed (second element, index 1, value 14).
        int removeIndex = 1;

        // Loop to remove the element at the specified index.
        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }

        // Print the modified array after removing the second element.
        System.out.println("After removing the second element: " + Arrays.toString(my_array));
    }
}
