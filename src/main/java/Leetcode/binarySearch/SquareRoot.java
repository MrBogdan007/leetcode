package Leetcode.binarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(14));
        System.out.println(squareRoot(16));
    }

    //Is there an integer x whose square equals num?
    private static boolean squareRoot(int num) {
        if (num < 1) return false;

        int start = 1;
        int end = num;
        while (start<=end){
            int mid = start+ ( end - start)/2;
            long target = (long) mid *mid;
            if(target==num){
                return true;
            }

            if( num < target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }


}
// start------mid------end
//  start-----end