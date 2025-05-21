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
        System.out.println(Arrays.toString(Arrays.copyOf(nums, i)));
        System.out.println(Arrays.toString(nums));//[1, 2, 2] not the [1, 2]
        return set.size(); // Return new length
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
