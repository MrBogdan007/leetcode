package w3school.array.SecondLargest;

import java.util.Arrays;

public class SecondLargests {
    //Write a Java program to find the second largest element in an array.
    //Write a Java program to find the third largest number in an array.
    //Write a Java program to find the second largest element in an array without sorting
    public static void main(String[] args) {
        int[] my_array = {
                10789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        secondLargest(my_array);
        secondLargest2(my_array);
    }

    private static void secondLargest2(int[] myArray) {
    int largest = 0;
    int secondLargest = 0;
        for (int i = 0; i < myArray.length; i++) {
            if(secondLargest<largest){
                secondLargest = largest;
            }
            if(myArray[i]>largest){
                largest=myArray[i];

            }

        }
        System.out.println();
        System.out.printf("Largest %d , second largest %d",largest,secondLargest);
    }

    private static void secondLargest(int[] myArray) {
        Arrays.sort(myArray);
        System.out.printf("Seconds largest %d",myArray[myArray.length-2]);
        System.out.println();
        System.out.printf("Third largest %d",myArray[myArray.length-3]);
    }
}
