package Leetcode.arrays;
import java.util.HashSet;
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [2,2,1]
//
//Output: 1
//
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//
//Output: 4
//
//Example 3:
//
//Input: nums = [1]
//
//Output: 1


public class SingleNumber {
    public static void main(String[] args) {
        //“What would the total sum be if every number appeared twice?
        // Now compare that to what we actually have — the difference is the missing copy, i.e., the unique number.”
        System.out.println(singleNumber(new int[]{809, 549,809, 66,66}));
        System.out.println(singleNumber2(new int[]{809, 549,809, 66,66}));

    }
    public static int singleNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int uniqueSum=0;
        int wholeSum=0;
        for (int singleNumber : nums ){
            if(hashSet.add(singleNumber)){
                uniqueSum+= singleNumber;
            }
            wholeSum+=singleNumber;

        }
        return  2 * uniqueSum - wholeSum;
    }



    public static int singleNumber2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sumUnique = 0;
        int sumAll = 0;

        for (int num : nums) {
            if (set.add(num)) { // first time seeing this number
                sumUnique += num;
            }
            sumAll += num;
        }

        return 2 * sumUnique - sumAll;
    }

}

