public class Merge {
//We start from the end of both arrays so we don’t overwrite elements in A.
//We'll place the largest values at the end of A, moving backward.
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int nums1Length = m - 1;  // i = 2 (last valid element index in A)
            int nums2Length = n - 1; // j = 2 (last element index in B)
            int bothLength = m + n - 1; // k = 5 (last index of full array A)
            while( nums1Length >= 0 && nums2Length >= 0){
                if(nums1[nums1Length] > nums2[nums2Length]){
                    nums1[bothLength--] =  nums1[nums1Length--]; // putting at the end of nums1+nums2
                                                                //  largest element from nums1
                }else{
                    nums1[bothLength--] = nums2[nums2Length--   ];  // putting at the end of nums1+nums2
                                                                    //  largest element from nums2
                }
            }

        }

}
