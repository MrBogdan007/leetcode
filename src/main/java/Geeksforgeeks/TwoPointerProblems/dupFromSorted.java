package Geeksforgeeks.TwoPointerProblems;

public class dupFromSorted {
//    Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray.
//
//            Note: The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.
//
//    Examples:
//
//    Input: arr[] = [2, 2, 2, 2, 2]
//    Output: [2]
//    Explanation: All the elements are 2, So only keep one instance of 2.
//
//    Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
//    Output: [1, 2, 3, 4, 5]
//
//    Input: arr[] = [1, 2, 3]
//    Output: [1, 2, 3]
//    Explanation : No change as all elements are distinct.
public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
    removeDuplicates(arr);
//    int newSize = removeDuplicates2(arr);
//    for (int i = 0; i < newSize; i++) {
//        System.out.print(arr[i] + " ");
//    }
}

    private static void removeDuplicates(int[] arr) {
        int writeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i+1 < arr.length&&arr[i]!=arr[i+1]){
                arr[writeIndex++] = arr[i];
            }if(i+1 == arr.length ){
                arr[writeIndex] = arr[i];
            }
        }
        for (int i = 0; i <= writeIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicates2(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return n;

        // Start from the second element
        int idx = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
}
