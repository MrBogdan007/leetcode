package w3resource.array.CopyArray;

public class DeepCopy2DArray {
    public static void main(String[] args) {
        int[][] original = {{1, 2, 3}, {4, 5}, {2, 7, 8, 9}};
        int[][] shallowCopy = original;
        print2DArray(shallowCopy);
        original= new int[][]{{1, 2, 1}, {1, 5}, {2, 7, 8, 9}};
        print2DArray(original);
        print2DArray(shallowCopy);
        // Perform deep copy
        int[][] deepCopied = deepCopy(original);
    }
    public static int[][] deepCopy(int[][] originalArray) {
        if (originalArray == null) {
            return null;
        }

        // Create a new array with the same number of rows as the original
        int[][] copiedArray = new int[originalArray.length][];

        // Iterate through each row of the original array
        for (int i = 0; i < originalArray.length; i++) {
                copiedArray[i] = new int[originalArray[i].length];
                for (int j = 0; j < originalArray[i].length; j++) {
                    copiedArray[i][j] = originalArray[i][j];
                }

        }
        print2DArray(copiedArray);
        return copiedArray;
    }
    public static void print2DArray(int[][] array) {
      for (int [] singleArray : array){
          for (int singleDigit : singleArray){
              System.out.printf("%2d",singleDigit);
          }
      }
        System.out.println();

    }
}
