package Leetcode.binarySearch;

public class FindSmallestLetter {
    public static void main(String[] args) {
//        System.out.println(nextGreatestLetter(new char[]{'c','f','j'},'a'));
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'},'c'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int min = 0;
        while (start<=end){
            int mid = start+ (end-start)/2;

            if(letters[mid]>target){
                min = mid;
                end = mid - 1;

            } else {
                start = mid + 1;

            }
        }
        //if binary search didnt find lesser letter return first one
        //        letters = ['c','f','j']
        //        target = 'j'
    return min == 0 ?letters[0]:letters[min];
    }

}
