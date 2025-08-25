package w3resource.array.Search.BinarySearch;

public class FindElementWhile {
    // Write a Java program to find a specified element in a given array of elements using Binary Search.
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 8, 12, 14, 23};
        int element = 23;

        int index = searchElement(arr, element);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int searchElement(int[] arr, int element) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == element) {
                return middle; // Found
            }

            if (arr[middle] > element) {
                end = middle - 1; // search left
            } else {
                start = middle + 1; // search right
            }
        }

        return -1; // Not found
    }
}
