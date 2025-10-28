package Geeksforgeeks.TwoPointerProblems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SumOfPairEqualToTarget {
//    Given a sorted array arr (sorted in ascending order) and a target,
//    find if there exists any pair of elements (arr[i], arr[j]) such that their sum is equal to the target.


//Given an integer array arr[] and an integer ele the task is to the remove all occurrences of ele from arr[]
// in-place and return the number of elements which are not equal to ele. If there are k number of elements
// which are not equal to ele then the input array arr[] should be modified such that the first
// k elements should contain the elements which are not equal to ele and then the remaining elements.
//Note: The order of first k elements may be changed.
    public static void main(String[] args) {
        int[] arr = {10,20,35,50};
        int target = 70;
       boolean result =  sumToTarget(arr,target);
        System.out.println(result);
        int res2 = RemoveAllElementsInPlace(new int[]{3,2,2,3},3);
        removeDuplicates(new int[]{3,2,2,3});

    }

    private static int RemoveAllElementsInPlace(int[] arr, int i) {
        int writeIndex = 0;
        // move all correct elements to the beginning
        // move all incorrect elements to the end
        for (int readIndex = 0; readIndex < arr.length; readIndex++) {
           if(arr[readIndex]!= i) {
               arr[writeIndex]=arr[readIndex];
               writeIndex++;
           }
        }
        for (int readIndex = 0; readIndex < writeIndex; readIndex++) {
            System.out.print(arr[readIndex] + " ");
        }
        return writeIndex;
    }

    static boolean  sumToTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int sum = 0;
        while (start<end){
            sum = arr[start]+ arr[end];
            if(sum==target){
                return true;
            }
            if(sum > target){
                end--;
            }else{
                start++;
            }
        }
    return false;
    }
    public static int removeDuplicates(int[] nums){
        // Use LinkedHashSet to preserve order
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        System.out.println(set);
        System.out.println(set.size());
        int i = 0;
        for (int val : set) {
            nums[i++] = val; // Copy back to nums
        }
        System.out.println(Arrays.toString(Arrays.copyOf(nums, i))); //[1, 2]
        System.out.println(Arrays.toString(nums));//[1, 2, 2] not the [1, 2]
        return set.size(); // Return new length
    }

}
