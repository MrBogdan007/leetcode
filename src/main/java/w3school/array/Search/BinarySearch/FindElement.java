package w3school.array.Search.BinarySearch;

public class FindElement {
    //Write a Java program to find a specified element in a given array of elements using Binary Search.
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 8, 12, 14, 23};
        int element = 23;

        int index = searchElement(arr, element, 0, arr.length - 1);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int searchElement(int[] arr, int element, int start, int end) {
        if (start > end) {
            return -1;
        }
//to avoid potential integer overflow in very large arrays.
        int middle = start + (end - start) / 2;  // avoids overflow

        if (arr[middle] == element) {
            return middle;
        }
        if (arr[middle] > element) {
            return searchElement(arr, element, start, middle - 1);
        }
        return searchElement(arr, element, middle + 1, end);
    }
}
