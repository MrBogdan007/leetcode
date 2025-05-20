import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        twoSum(new int []{2,7,11,15}, 9);
        twoSumHashMap(new int []{2,7,11,15}, 9);
        int[] nums = {1,1,2}; // Input array
        int[] expectedNums = {1,2}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
            System.out.println(nums[i] == expectedNums[i]);
        }
        System.out.println(k);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = null;
       for (int i = 0; i < nums.length; i++){
        for (int j = nums.length-1; j>=0; j--){
            if(i == j) continue;
            if((nums[i]+nums[j])==target){
                result = new int[] {i,j};
                return result;
            }
        }
       }
       return null;
    }
    public static int[] twoSumHashMap(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            int complement = target - nums[i] ;
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        System.out.println(set);

    }
}
