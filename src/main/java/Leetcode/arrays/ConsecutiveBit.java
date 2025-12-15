package Leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class ConsecutiveBit {
    public static void main(String[] args) {
        findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
    }
    //ez solo ne oshytil
    public static int findMaxConsecutiveOnes2(int[] nums) {
        //group , number of ones
        HashMap<Integer,Integer> hm = new HashMap<>();
        int group = 0;
        int counter = 1;
        for(int i = 0;  i< nums.length; i++){

            if(nums[i]==1){
                hm.put(group,counter++);
            }else{
                counter=1;
                group++;
            }
        }
            int result = 0;
        for (Map.Entry<Integer,Integer> i : hm.entrySet()){
           if(i.getValue()> result){
               result = i.getValue();
           }
        }
      return result;
    }


    public static  int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        // comparing iterative count and maximum variable to get max with Math.max
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] ==1) {
                count++;
            } else {
                //if 0 counter reset
                max = Math.max(count, max);
                count = 0;
            }
        }

        return Math.max(count, max);
    }
}
