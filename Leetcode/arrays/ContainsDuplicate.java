package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{2,2,3,4,5,6,7,8,9}));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int number : nums){
            set.add(number);
        }
        if(set.size() == nums.length){
            return false;
        }else {
            return true;
        }
      }

}
