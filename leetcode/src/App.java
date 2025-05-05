public class App {
    public static void main(String[] args) throws Exception {
        twoSum(new int []{2,7,11,15}, 9);
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
}
