package Leetcode.binarySearch;

public class Test {
//    Search Insert Position
//            Solved
//    Easy
//            Topics
//    premium lock icon
//            Companies
//    Given a sorted array of distinct integers and a target value,
//    return the index if the target is found. If not, return the index where it
//    would be if it were inserted in order.
//
//    You must write an algorithm with O(log n) runtime complexity.
//
//
//
//    Example 1:
//
//    Input: nums = [1,3,5,6], target = 5
//    Output: 2
//    Example 2:
//
//    Input: nums = [1,3,5,6], target = 2
//    Output: 1
//    Example 3:
//
//    Input: nums = [1,3,5,6], target = 7
//    Output: 4


// Given a sorted array , write a function that  returns the index for the given element;


    public static void main(String[] args) {
        int [] arr = new int[]{2,3,5,6};
        int result = searchInsert(arr,1);
        System.out.println(result);
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int middle = start+ (end-start)/2;
            if(nums[middle]==target){
                return middle;
            } else if (nums[middle]>target) {
                end = middle -1;
            }else {
                start = middle + 1;
            }
        }
        // in case  index where it would be if it were inserted in order.
        return start;


    }
}
