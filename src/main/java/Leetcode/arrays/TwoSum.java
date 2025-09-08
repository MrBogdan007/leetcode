package Leetcode.arrays;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum ( int[] nums, int target){
        int[] result = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (i == j) continue;
                if ((nums[i] + nums[j]) == target) {
                    result = new int[]{i, j};
                    return result;
                }
            }
        }
        return null;
    }
    public static int[] twoSumHashMap ( int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
    public static int[] twoSumTwoPointers ( int[] nums, int target){
            int start = 0, end = nums.length - 1;
            while(start < end){
                if(nums[start] + nums[end] == target){
                    System.out.printf("%s %s", start , end);
                    return new int[] {start,end};
                } else if (nums[start] + nums[end] < target) {
                    start++;
                }else {
                    end--;
                }
            }
        System.out.println("asdasd");
        return new int[]{};
    }
}
