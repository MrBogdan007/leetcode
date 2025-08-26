package Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
//    Given an array nums of size n, return the majority element.
//
//    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//
//
//    Example 1:
//
//    Input: nums = [3,2,3]
//    Output: 3
//    Example 2:
//
//    Input: nums = [2,2,1,1,1,2,2]
//    Output: 2

    public static void main(String[] args) {
//        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement2(new int[]{3,2,3,4,3,3,3,1}));

    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
    public static int majorityElement2(int[] nums) {
       int n = nums.length;
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < n; i++) {
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
       }
        System.out.println(map.entrySet());
        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return 0;
    }


}
