package Leetcode.Matrices;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};


        int[][] result = flipAndInvertImage(image);
        for (int[] row: result){
            for (int val: row){
                System.out.print(val+ " ");
            }
        }
    }

//    Swap image[i][left] and image[i][right].
//    Invert both using XOR (^1).
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
           int left = 0;
           int right = image[i].length-1;
           while (left< right){
               int temp = image[i][left];
               image[i][left] = image[i][right];
               image[i][right] = temp;
               left++;
               right--;
           }
        }

        // Step 2: Invert (0 -> 1, 1 -> 0)
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] ^= 1; // XOR with 1 flips 0->1 and 1->0
            }
        }

        return image;
    }

}
