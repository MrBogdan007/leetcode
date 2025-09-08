package Leetcode.arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1]; // overwrite with last valid element
                n--; // reduce size
            } else {
                i++;
            }
        }
        System.out.println(n+ ": n; "+ i+ " :i;");
        return n; // new length of valid elements
    }
    public int findNoSpecifiedInputValue(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
