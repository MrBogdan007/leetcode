public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1]; // overwrite with last valid element
                n--; // reduce size
            } else {
                i++;
            }
        }
        return n; // new length of valid elements
    }

}
