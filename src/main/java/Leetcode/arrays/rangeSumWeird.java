package Leetcode.arrays;

public class rangeSumWeird {

}
class NumArray2 {

    private  int[] globalArr;

    public static void main(String[] args) {
        NumArray2 numArray = new NumArray2(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0,2));
    }

    public NumArray2(int[] nums) {
        globalArr= nums;
    }

    public  int sumRange(int left, int right) {
        int sum =0 ;
        while (left<=right){
              sum += globalArr[left];
            left++;
        }
       return sum;
    }
}

class NumArray {

    private int[] prefixSum; // stores cumulative sums

    public NumArray(int[] nums) {
        prefixSum = new int[nums.length + 1]; // one extra slot for easier math
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        //prefixSum = [0, -2, -2, 1, -4, -2, -3]
//        prefixSum[0] = 0   // always 0, for convenience
//        prefixSum[1] = -2  // sum of nums[0]
//        prefixSum[2] = -2  // sum of nums[0..1] = -2 + 0
//        prefixSum[3] = 1   // sum of nums[0..2] = -2 + 0 + 3
//        prefixSum[4] = -4  // sum of nums[0..3] = -2 + 0 + 3 + (-5)
//        prefixSum[5] = -2  // sum of nums[0..4] = ...
//        prefixSum[6] = -3  // sum of nums[0..5]

//        We start the array with one extra element (0) at the beginning.
//                That’s why we write:
//
//        prefixSum[i + 1] = prefixSum[i] + nums[i];
//
//
//        So:
//
//        prefixSum[1] stores the sum of the first 1 element (nums[0])
//
//        prefixSum[2] stores the sum of the first 2 elements (nums[0] + nums[1])
//
//        prefixSum[3] stores the sum of the first 3 elements (nums[0] + nums[1] + nums[2])
//
//        and so on.
//
//                That +1 offset lets us easily calculate any range later
//        To get sum(2..5):
//
//        prefixSum[6] - prefixSum[2] = (-3) - (-2) = -1
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}
