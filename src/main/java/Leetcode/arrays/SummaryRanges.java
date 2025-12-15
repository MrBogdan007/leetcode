package Leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
//    You are given a sorted unique integer array nums.
//
//    A range [a,b] is the set of all integers from a to b (inclusive).
//
//    Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered
//    by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
//
//    Each range [a,b] in the list should be output as:
//
//            "a->b" if a != b
//"a" if a == b
//
//
//    Example 1:
//
//    Input: nums = [0,1,2,4,5,7]
//    Output: ["0->2","4->5","7"]
//    Explanation: The ranges are:
//            [0,2] --> "0->2"
//            [4,5] --> "4->5"
//            [7,7] --> "7"
//    Example 2:
//
//    Input: nums = [0,2,3,4,6,8,9]
//    Output: ["0","2->4","6","8->9"]
//    Explanation: The ranges are:
//            [0,0] --> "0"
//            [2,4] --> "2->4"
//            [6,6] --> "6"
//            [8,9] --> "8->9"
    public static void main(String[] args) {
//        List<String> lsr= summaryRanges(new int[]{0,1,2,4,5,7});
//        List<String> lsr2= summaryRanges2(new int[]{0,1,2,4,5,7});
        List<String> lsr3= summaryRanges(new int[]{0,1,2,4,5,7});
//        System.out.println(lsr);
//        System.out.println(lsr2);
        System.out.println(lsr3);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int start = 0;

        while (start < nums.length) {
            int end = start;

            // move end while next number is consecutive
            while (end + 1 < nums.length && nums[end + 1] == nums[end] + 1) {
                end++;
            }

            // range is nums[start] -> nums[end]
            if (start == end) {
                result.add(String.valueOf(nums[start]));
            } else {
                result.add(nums[start] + "->" + nums[end]);
            }

            start = end + 1; // move start to next range
        }

        return result;
    }
}
