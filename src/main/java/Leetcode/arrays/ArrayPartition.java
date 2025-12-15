package Leetcode.arrays;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.math.NumberUtils.min;

public class ArrayPartition {

    public static void main(String[] args) {
       int result =  optimalPairing(new int[]{6,2,6,5,1,2});
        System.out.println(result);
    }

    private static int optimalPairing(int[] arr) {
        // i only take minimum out of 2 , arrays is 2n , so every second will always be minimum after sort
        Arrays.sort(arr);
        int result = 0;
        for (int i = 0; i < arr.length; i+=2) {
                result += arr[i];
        }
        return result;
    }
}


class PairMinSum {
    public static void main(String[] args) {

        // Example 1: (1,4) and (2,3)
        int result1 = minSum(new int[]{1, 4}, new int[]{2, 3});
        System.out.println(result1);  // 3

        // Example 2: (1,3) and (2,4)
        int result2 = minSum(new int[]{1, 3}, new int[]{2, 4});
        System.out.println(result2);  // 3

        // Example 3: (1,2) and (3,4)
        int result3 = minSum(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(result3);  // 4
    }

    static int minSum(int[] a, int[] b) {
        return Math.min(a[0], a[1]) + Math.min(b[0], b[1]);
    }
}



 class PairingMinSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        List<List<int[]>> pairings = generatePairings(nums);

        for (List<int[]> pairs : pairings) {
            int sum = 0;
            for (int[] p : pairs) {
                sum += Math.min(p[0], p[1]);
            }

            // Print pairs
            for (int[] p : pairs) {
                System.out.print("(" + p[0] + ", " + p[1] + ") ");
            }
            System.out.println(" -> sum = " + sum);
        }
    }

    // Generate all unique pairings
    static List<List<int[]>> generatePairings(int[] nums) {
        List<List<int[]>> result = new ArrayList<>();
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }

    static void backtrack(int[] nums, boolean[] used, List<int[]> current, List<List<int[]>> result) {
        int firstUnused = -1;

        // Find first unused element
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                firstUnused = i;
                break;
            }
        }

        // All paired → add to result
        if (firstUnused == -1) {
            result.add(new ArrayList<>(current));
            return;
        }

        used[firstUnused] = true;

        // Pair it with every other unused element
        for (int j = firstUnused + 1; j < nums.length; j++) {
            if (!used[j]) {
                used[j] = true;
                current.add(new int[]{nums[firstUnused], nums[j]});

                backtrack(nums, used, current, result);

                current.remove(current.size() - 1);
                used[j] = false;
            }
        }

        used[firstUnused] = false;
    }
}
