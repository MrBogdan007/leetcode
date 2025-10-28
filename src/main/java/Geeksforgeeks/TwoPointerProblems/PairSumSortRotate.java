package Geeksforgeeks.TwoPointerProblems;

public class PairSumSortRotate {
    // 1, 4 , 2, 25
//    Given an array arr[] of size n, which is sorted and then
//    rotated around an unknown pivot, the task is to check whether there exists a pair of
//    elements in the array whose sum is equal to a given target value.
//
//            Examples :
//
//    Input: arr[] = [11, 15, 6, 8, 9, 10], target = 16
//    Output: true
//    Explanation: There is a pair (6, 10) with sum 16.
//
//    Input: arr[] = [11, 11, 15, 26, 38, 9, 10], target = 35
//    Output: true
//    Explanation: There is a pair (26, 9) with sum 35.
//
//    Input: arr[] = [9, 10, 10, 11, 15, 26, 38], target = 45
//    Output: false
//    Explanation: There is no pair with sum 45.
static boolean pairInSortedRotated(int[] arr, int target) {
    int n = arr.length;

    // Find the pivot element
    int i;
    for (i = 0; i < n - 1; i++)
        if (arr[i] > arr[i + 1])
            break;

    // l is now index of smallest element
    int l = (i + 1) % n;

    // r is now index of largest element
    int r = i;

    // Keep moving either l or r till they meet
    while (l != r) {

        // If we find a pair with sum target, return true
        if (arr[l] + arr[r] == target)
            return true;

        // If current pair sum is less, move to higher sum
        if (arr[l] + arr[r] < target) //sum < target → move left++ (you need a bigger number)
            l = (l + 1) % n; //l = 5, (l + 1) % 6 = 0 - pointing back to the start (value 11).

            // Move to lower sum side
        else //sum > target → move right-- (you need a smaller number)
            r = (r - 1 + n) % n;
        //r = (0 - 1 + 6) % 6 = 5 - wraps around to the end of the array (value 10).
    }
    return false;
}

    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int[] arr2 = {11, 11, 15, 26, 38, 9, 10};
        int target = 16;
        int target2 = 35;
        if (pairInSortedRotated(arr, target))
            System.out.println("true");
        else
            System.out.println("false");

        if (pairInSortedRotated(arr2, target2))
            System.out.println("true");
        else
            System.out.println("false");
    }

//    Think of the array like a clock (0–5 hours).
//    If you’re at hour 5 and go one hour forward → (5 + 1) % 6 = 0.
//    If you’re at hour 0 and go one hour backward → (0 - 1 + 6) % 6 = 5.
//    Same idea — time and indices both “wrap around” cyclically.
}
//
//        15
//     /       \
//   11         6
//    |         |
//   10         8
//     \       /
//        9
