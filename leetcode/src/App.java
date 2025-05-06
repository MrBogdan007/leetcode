import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        twoSum(new int []{2,7,11,15}, 9);
        twoSumHashMap(new int []{2,7,11,15}, 9);
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
}
