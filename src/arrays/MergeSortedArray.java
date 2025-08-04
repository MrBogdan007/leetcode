package arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
    //mergeArray(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6},  3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndexFirst = m - 1;
        int lastIndexSecond = n - 1;
        int bothLength = m+n - 1;
        while(lastIndexSecond >= 0  ){
            if(lastIndexFirst >= 0 &&nums1[lastIndexFirst] > nums2[lastIndexSecond]){
                nums1[bothLength--] = nums1[lastIndexFirst--];
            }else{
                nums1[bothLength--] = nums2[lastIndexSecond--];
            }
        }

    }

}
