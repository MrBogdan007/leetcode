package Leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllNumbersThatDissapear {
    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    }


    public static void findDisappearedNumbers3(int[] nums) {
        int range = nums.length;
        List<Integer> elOutOfRange = new ArrayList<>();
        HashMap<Integer, Integer> elCount = new HashMap<>();

        for (int i = 0; i < range; i++) {
            elCount.put(nums[i],elCount.getOrDefault(nums[i],0)+1);
        }
        int rangeCounter = 1;
        for (int i = 0; i < elCount.size(); i++) {
            if(!elCount.containsKey(rangeCounter)){
                elOutOfRange.add(rangeCounter);
            }
        }
        System.out.println(elOutOfRange);
        System.out.println(elCount);
    }
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        int range = nums.length;
        List<Integer> elOutOfRange = new ArrayList<>();
        int start = 0;
        while (start<range){
            start++;
            int startElement = nums[start];
            int end = start;
        }
        return elOutOfRange;
    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int range = nums.length;
        List<Integer> elOutOfRange = new ArrayList<>();

        for (int i = 1; i <= range; i++) {
            boolean found  = false;
            for (int j = 0; j < range; j++) {
                if(i == nums[j] ){
                    found = true;
                    break;
                }
            }
            if(!found){
                elOutOfRange.add(i);
            }

        }

        return  elOutOfRange;
    }
}
