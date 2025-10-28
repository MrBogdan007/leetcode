package Leetcode.arrays;

public class NoMaxOrMin {
    public static void main(String[] args) {
        int [] arr = {3,2,1,4};

      int result =   NorMaxORMin(arr);
        System.out.println(result);

    }

    private static int NorMaxORMin2(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // First pass: find min and max
        for (int n : nums) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        // Second pass: find any number that's not min or max
        for (int n : nums) {
            if (n != max && n != min) {
                return n; // return first "normal" number
            }
        }

        // If all numbers are the same or only min/max exist
        return -1;
    }

    private static int NorMaxORMin(int[] nums) {
       int max = 0;
       int min = 0;
       int exact = 0;

        for (int n:nums) {
            exact = n;
            if( max < n){
                max = n;
                min = max;
            }

            if( min > n ){
                min = n;
            }
            if( n < max && n > min){
                return n;
            }

        }
        return  -1;
    }
}

class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3)
            return -1;
        //works for bigger arrays also [2,1,3,45,24,4,6]
//        That’s a valid answer — 2 is neither the min (1) nor max (45).
//                So even though the array is longer, the algorithm
//        still works fine because we only need one valid number that satisfies “not min, not max”.
        int a = Math.min(nums[0], nums[1]);
        int b = Math.max(nums[0], nums[1]);
        int c = nums[2];

        if (c > a && c < b) return c;
        if (c < a) return a; // c lees than b means c is minimum number
        if (c > b) return b; // c more than b means c is maximum number

        return -1;
    }
}
