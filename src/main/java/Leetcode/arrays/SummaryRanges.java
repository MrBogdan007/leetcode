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
        List<String> lsr3= summaryRanges3(new int[]{0,1,2,4,5,7});
//        System.out.println(lsr);
//        System.out.println(lsr2);
        System.out.println(lsr3);
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }

        int start = 0;
        while (start < nums.length) {
            //update start
            // update end(end becomes start to match the new range) every time
            int startRangeElement = nums[start];
            int end = start;
            // Expand the range as long as elements are consecutive
            // Increasing end index only if next element it +1 as current
            while (end + 1 < nums.length && nums[end + 1] == nums[end] + 1) {
                end++;
            }


            // Format the range string
            if (nums[end] == startRangeElement) {
                result.add(String.valueOf(startRangeElement));
            } else {
                //in case next element is out of range it will print correctly and in next iteration it will go in result.add(String.valueOf(startRangeElement));
                //as start is = end +1 and at the start of while int end = start;
                result.add(startRangeElement + "->" + nums[end]);
            }

            // Move to the index to the start
            start = end + 1;
        }
        return result;
    }
    public static List<String> summaryRanges2(int[] nums) {
        List<String> listRanges = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = 0;

            int end = 0;

            if(i+1<nums.length&&nums[i+1]!=nums[i]+1){
                end = nums[i+1];
                start = nums[i];
                listRanges.add(String.valueOf(start)+"->"+ String.valueOf(end) );
            }else {
                end= nums[i];
                listRanges.add(start+"->"+end);
            }


        }
        return listRanges;
    }
    public static List<String> summaryRanges3(int[] nums) {
        int start = 0;
        List<String> result = new ArrayList<>();
        while(start < nums.length){
            int startElement = nums[start];
            int end = start;
            while(end + 1 < nums.length && nums[end]+1 ==nums[end+1]){
                end++;
            }
            //if range has 1 element
            if(startElement==nums[end]){
                result.add(String.valueOf(startElement));
            }else{
                result.add(startElement+"-->"+nums[end]);
            }

            start = end + 1;
        }
        return result;
    }
}
