package arrays;

import java.util.HashMap;

public class DuplicatesDistance {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); // stores number -> index

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                // if found before, check the index difference
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // update the index of the current number
            map.put(nums[i], i);
        }
        System.out.println(map);
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println(containsNearbyDuplicate(nums1, k1)); // true

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println(containsNearbyDuplicate(nums2, k2)); // true

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println(containsNearbyDuplicate(nums3, k3)); // false
    }
}
