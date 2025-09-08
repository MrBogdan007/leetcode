package w3school.array.CopyArray;

import java.util.Arrays;

public class AlternateArrayCopy {

    public static void main(String[] args) {
        int[] sourceArray = {10, 20, 30, 40, 50, 60, 70, 80};

        // Calculate the size of the destination array.
        // It will be half the size of the source array if the source has an even number of elements,
        // or (sourceArray.length / 2) + 1 if the source has an odd number of elements.
        int destinationSize = (sourceArray.length + 1) / 2;
        int[] destinationArray = new int[destinationSize];

        // Copy alternate elements
        for (int i = 0, j = 0; i < sourceArray.length; i += 2, j++) {
            destinationArray[j] = sourceArray[i];
        }

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Destination Array (Alternate Elements): " + Arrays.toString(destinationArray));
    }
}