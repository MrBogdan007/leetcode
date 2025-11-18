package Leetcode.arrays;

import java.util.*;

public class Intersection2 {
}
class Solution243 {
    public static void main(String[] args) {
        Solution243 solution = new Solution243();
//       int [] result =  solution.intersect(new int[]{1,2,2,1},new int[]{2,2});
       int [] result2 =  solution.intersectMap2(new int[]{1, 2, 2, 2},new int[]{2,2});
       int [] result3 =  solution.intersectMap2(new int[]{1, 2},new int[]{9});
//        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));


    }
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int n: nums1){
            al1.add(n);
        }
        for (int n: nums2){
            al2.add(n);
        }

        al1.retainAll(al2);

        return  al1.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] intersectMap(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> arraysMap = new HashMap<>();

        for (int n:nums1){
            arraysMap.put(n,arraysMap.getOrDefault(n, 0)+1);
        }
        List<Integer> result = new ArrayList<>();
        for (int n: nums2){

            if(arraysMap.containsKey(n)){
                result.add(n);
            }
            arraysMap.put(n,arraysMap.getOrDefault(n,0)+1);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] intersectMap2(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) map.put(n, map.getOrDefault(n, 0) + 1);

        List<Integer> result = new ArrayList<>();
        for (int n : nums2) {
            if (map.getOrDefault(n, 0) > 0) { // if we already have in map value 1
                result.add(n); // we add it to result
                map.put(n, map.get(n) - 1);  // Update element  - remove it's value from map , so no dublicates
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }


}


class Solution11111 {
    public static void main(String[] args) {
        Solution11111 solution = new Solution11111();
        int[] result = solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        System.out.println(Arrays.toString(result)); // [2, 2]
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> al1 = new ArrayList<>();
        for (int n : nums1) al1.add(n);

        List<Integer> result = new ArrayList<>();
        for (int n : nums2) {
            if (al1.contains(n)) {
                result.add(n);
                al1.remove(Integer.valueOf(n)); // remove one occurrence
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
