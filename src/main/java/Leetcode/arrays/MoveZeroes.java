package Leetcode.arrays;

import java.util.Arrays;

public class MoveZeroes {
//    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//    Note that you must do this in-place without making a copy of the array.
//
//
//
//    Example 1:
//
//    Input: nums = [0,1,0,3,12]
//    Output: [1,3,12,0,0]
//    Example 2:
//
//    Input: nums = [0]
//    Output: [0]
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static void moveZeroes2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==0){
                    int temp = nums[i];
                    if(nums[j]!=0){
                        nums[i]=nums[j];
                    }
                    nums[j] = temp;
                }
            }


        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move all non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill remaining positions with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

}
