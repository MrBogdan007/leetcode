package w3school.array.CopyArray;

public class DeepCopyDemo {
    public static void main(String[] args) {
        int[][] original = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        int[][] deepCopied = deepCopy(original);

        // Modify original
        original[0][0] = 99;
        original[2][3] = 42;

        System.out.println("Original:");
        print2DArray(original);

        System.out.println("\nDeep Copied:");
        print2DArray(deepCopied);
    }

    public static int[][] deepCopy(int[][] originalArray) {
        if (originalArray == null) return null;

        int[][] copiedArray = new int[originalArray.length][];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = new int[originalArray[i].length];
            for (int j = 0; j < originalArray[i].length; j++) {
                copiedArray[i][j] = originalArray[i][j];
            }
        }
        return copiedArray;
    }

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
