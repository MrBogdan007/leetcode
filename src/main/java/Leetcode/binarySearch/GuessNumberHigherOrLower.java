//
//package Leetcode.binarySearch;
//
//public class GuessNumberHigherOrLower {
//
//
//}
//
//public class Solution extends GuessGame {
//    public int guessNumber(int n) {
//        int start = 0;
//        int end = n;
//
//        while(start<=end){
//            int middle = start+(end - start)/2;
//
//
//            if(middle == 0){
//                return middle;
//            }
//
//            else if(guess(middle)==-1){
//                start = middle +1;
//            }
//
//            else{
//                end = middle - 1;
//            }
//
//        }
//        return start;
//    }
//
//    private int guess(int middle) {
//    }
//}