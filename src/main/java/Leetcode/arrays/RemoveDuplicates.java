package Leetcode.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {



    public static int removeDuplicates(int[] nums){
        // Use LinkedHashSet to preserve order
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int i = 0;
        for (int val : set) {
            nums[i++] = val; // Copy back to nums
        }
        return set.size(); // Return new length
    }
// if next element not same as previous just move forward in j loop
// if next element is not the same than it's unique element and we put it at the beginning of array
// i element only be increased if i found uniquer element
// in big picture i ovveride left side of the array and right side stays the same as it is built in array
    public static int findUnique(int[] nums){
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[j - 1 ]){
            nums[i] = nums[j];
            i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(i);
        System.out.println(nums.length);
        return i;
    }

//    public static int removeDuplicates(int[] nums) {
//        LinkedHashSet<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
//        System.out.println(set);
//        System.out.println(Arrays.toString(nums));
//        int i = 0;
//        for (int val : set) {
//            i++;
//            if(i < set.size()){
//                System.out.println(val+"val");
//                System.out.println(set+ "set");
//
//                nums[i] = val; // Copy back to nums
//            }
//
//        }
//        System.out.println(Arrays.toString(nums));
//        return nums.length; // Return new length
//
//    }


}
