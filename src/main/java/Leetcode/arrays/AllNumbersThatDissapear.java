package Leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllNumbersThatDissapear {
    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
//        findDisappearedNumbers3(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    }


    public static void findDisappearedNumbers3(int[] nums) {
        int range = nums.length;
        List<Integer> elOutOfRange = new ArrayList<>();
        HashMap<Integer, Integer> elCount = new HashMap<>();

        for (int i = 0; i < range; i++) {
            elCount.put(nums[i],elCount.getOrDefault(nums[i],0)+1);
        }
        int rangeCounter = 1;
        for (int i = 0; i < range; i++) {
            if(!elCount.containsKey(rangeCounter)){
                elOutOfRange.add(rangeCounter);
            }
            rangeCounter++;
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

    //minus market marker for numbers( for eg. 4 will go to index 3 - 1,2,3,4)
    // i from cycle will always point to correct number from 0 to 7 which will be marked as minus
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int idx = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                idx = nums[i]*-1-1;
            }else{
                idx = nums[i]-1;
            }

            if(nums[idx]>0){
                nums[idx] = -nums[idx];
            }

        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            };

        }
        System.out.println(list);
        return list;
    }
//    Explanation:
//
//            4 → mark index 3 → nums[3] becomes -7
//
//            3 → mark index 2 → nums[2] becomes -2
//
//            2 → mark index 1 → nums[1] becomes -3
//
//            7 → mark index 6 → nums[6] becomes -3
//
//            8 → mark index 7 → nums[7] becomes -1
//
//            2 (again) → index 1 already negative → skip
//
//3 (again) → index 2 already negative → skip
//
//1 → mark index 0 → nums[0] becomes -4
//
//    Then, numbers that remain positive correspond to missing values:
//    nums[4] and nums[5] are positive → missing numbers are 5 and 6.

    public static List<Integer> findDisappearedNumbers4(int[] nums) {
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
