package w3school.array.Sorting.QuickSort;

import java.util.Arrays;

public class QS1 {
    // Method to test above
    public static void main(String args[])
    {
        QuickSort1 ob = new QuickSort1();
        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        ob.sort(nums);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(nums));
    }
}
