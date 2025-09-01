package w3resource.array.MinMax;

import java.util.Arrays;

public class FindSecondHighestAndSecondLowest {
    public static void main(String[] args) {
        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.printf("Second highest: %d, Second lowest: %d,", nums[nums.length-2], nums[1]);
    }

}
