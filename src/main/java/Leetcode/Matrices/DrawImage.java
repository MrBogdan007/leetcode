package Leetcode.Matrices;

public class DrawImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        System.out.println("Original Image:");
        drawImage(image);

        int[][] result = flipAndInvertImage(image);

        System.out.println("\nFlipped & Inverted Image:");
        drawImage(result);
    }

    // Method to draw a binary matrix as an image
    public static void drawImage(int[][] image) {
        for (int[] row : image) {
            for (int pixel : row) {
                if (pixel == 1) {
                    System.out.print("■ ");
                } else {
                    System.out.print("□ ");
                }
            }
            System.out.println();
        }
    }

    // Flip horizontally and invert
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int left = 0, right = image[i].length - 1;
            while (left <= right) { // <= handles odd-length rows
                // Swap and invert
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;
                left++;
                right--;
            }
        }
        return image;
    }
}
