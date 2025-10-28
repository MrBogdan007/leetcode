package Leetcode.arrays;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class ThirdMax {
//    414. Third Maximum Number
//            Easy
//    Topics
//    premium lock icon
//            Companies
//    Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist,
//    return the maximum number.

//    Example 1:
//
//    Input: nums = [3,2,1]
//    Output: 1
//    Explanation:
//    The first distinct maximum is 3.
//    The second distinct maximum is 2.
//    The third distinct maximum is 1.
//    Example 2:
//
//    Input: nums = [1,2]
//    Output: 2
//    Explanation:
//    The first distinct maximum is 2.
//    The second distinct maximum is 1.
//    The third distinct maximum does not exist, so the maximum (2) is returned instead.
//    Example 3:
//
//    Input: nums = [2,2,3,1]
//    Output: 1
//    Explanation:
//    The first distinct maximum is 3.
//    The second distinct maximum is 2 (both 2's are counted together since they have the same value).
//    The third distinct maximum is 1.

    public static void main(String[] args) {
      int result =   thirdDist2(new int[]{2,2,3,1});
      int result2 =   thirdDistInt(new int[]{2,2,3,1});
        System.out.println(result);
        System.out.println(result2);
    }

    public static int thirdDist2(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        //null helps us know which of max1, max2, max3 hasn’t been set yet.
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue; // checking for distinct elements
            if (max1 == null || n > max1) { //If n is the new largest, shift everything down.
                max3 = max2; // max 3 is  previous n  by 2
                max2 = max1; // max 2 is  previous n  by 1
                max1 = n;    // max 1 is current n
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3; // return max number else return third maximum number

    }

    public static int thirdDistInt(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int n : nums) {
            if (n == max1 || n == max2 || n == max3) continue;

            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }
        }

        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }


    private static void thirdDist(int[] nums) {
        boolean distinct = true;
        int writeIndex = 0;
        int [] arr2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            distinct=true;

            for (int j = i+1; j < nums.length; j++) {
            if(nums[i]==nums[j]){
                distinct = false;
            }
            }
            if(distinct){
                arr2[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        int firstNum = 0,secondNum = 0,thirdNum = 0;
        int[] arrNewLength = Arrays.copyOf(arr2,writeIndex);
        for (int i = 0; i < writeIndex; i++) {
            for (int j = i+1; j < writeIndex; j++) {
            if(arrNewLength[i]<arrNewLength[j]){
                firstNum = arrNewLength[j];
            }
            }
            for (int j = 0; j < writeIndex; j++) {
                if(arrNewLength[j]< firstNum){
                    secondNum = arrNewLength[j];
                    j=writeIndex-1;
                }
            }

            for (int j = 0; j < writeIndex; j++) {
                if(arrNewLength[j]< secondNum){
                    thirdNum = arrNewLength[j];

                }
            }
            i= writeIndex-1;
        }
        System.out.println(thirdNum);
    }

}
