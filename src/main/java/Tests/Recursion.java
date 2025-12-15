package Tests;

public class Recursion {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,6,7,8};
        System.out.println(sumRec(nums,0));
        System.out.println(factorial(6));
    }

  public static int sumRec(int[] nums, int index){

    if(index==nums.length)return 0;

    return nums[index] + sumRec(nums,index+1);
  }

  public static int factorial(int n ){

        if(n==0) return 1;


      return  n * (factorial(n-1));
  }
}
