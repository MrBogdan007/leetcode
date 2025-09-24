package w3school.array.SecondLargest;

import java.util.Arrays;

public class SecondSmallest {
    //Write a Java program to find the second smallest element in an array.
    //Write a Java program to find the second smallest element in an unsorted array without sorting.
    public static void main(String[] args) {
        int[] my_array = {-1, 4, 0, 2, 7, -3};
//        secondSmallest(my_array);
        secondSmallest2(my_array);
    }

    private static void secondSmallest2(int[] myArray) {
        int smallest = 0;
        int secondSmallest = 0;
        for (int i = 0; i < myArray.length; i++) {
            if(secondSmallest > smallest){
                secondSmallest = smallest;
            }
            if(myArray[i]<smallest){
                smallest=myArray[i];
            }

        }
        System.out.printf("Smallest: %d, Second smallest: %d",smallest,secondSmallest);
    }

    private static void secondSmallest(int[] myArray) {
        Arrays.sort(myArray);
        System.out.printf("Second smallest :%d", myArray[1]);
    }
}

