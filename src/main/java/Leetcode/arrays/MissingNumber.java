package Leetcode.arrays;

import java.util.Arrays;

public class MissingNumber {
//    Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//
//
//
//    Example 1:
//
//    Input: nums = [3,0,1]
//
//    Output: 2
//
//    Explanation:
//
//    n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//
//    Example 2:
//
//    Input: nums = [0,1]
//
//    Output: 2
//
//    Explanation:
//
//    n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//
//    Example 3:
//
//    Input: nums = [9,6,4,2,3,5,7,0,1]
//
//    Output: 8
//
//    Explanation:
//
//    n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
public static void main(String[] args) {

//    System.out.println(missingNumber(new int[] {3,0,1}));
//    System.out.println(missingNumber(new int[] {0,1,2,3}));//4 is missing  from range 0 - 4
//    System.out.println(missingNumber(new int[] {0,1}));
//    System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    System.out.println(missingNumber2(new int[] {3,0,1}));
    System.out.println(missingNumber2(new int[] {0,1,2,3}));//4 is missing  from range 0 - 4
    System.out.println(missingNumber2(new int[] {0,1}));
    System.out.println(missingNumber2(new int[] {9,6,4,2,3,5,7,0,1}));

}
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        //{0,1,2,3}
        for (int i = 0; i < nums.length; i++) {
           if(nums[i]!=i){
               return i;
           }

        }
        //n is last element in range ( in array we can only store 3 )
        return nums.length;
    }
    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // sum of 0..n
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum; // missing number
    }
}
