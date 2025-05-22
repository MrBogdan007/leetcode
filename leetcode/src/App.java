import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        TwoSum.twoSum(new int []{2,7,11,15}, 9);
        TwoSum.twoSumHashMap(new int []{2,7,11,15}, 9);
        removeDuplicatesJudge(new int[]{1,1,2});
        RemoveElements.removeElement(new int []{3,2,2,3}, 3);
        PlusOne.plusOne(new int []{9});
//        PlusOne.plusOne(new int []{9,9});
        PlusOne.plusOne(new int []{8,9,9,9});

    }

    public static void removeDuplicatesJudge(int[] nums) {
         // Input array
        int[] expectedNums = {1,2}; // The expected answer with correct length

        int k = RemoveDuplicates.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

    }
}
