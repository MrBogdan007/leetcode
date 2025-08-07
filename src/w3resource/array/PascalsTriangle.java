package w3resource.array;

import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();
        scanner.close();
        // i = rows , j = columns
        int[][] triangle = new int[numRows][];

        // Populate the Pascal's Triangle array
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1]; // Each row has i+1 elements
            triangle[i][0] = 1; // First element of each row is 1
            triangle[i][i] = 1; // Last element of each row is 1

            // Calculate intermediate elements
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print the Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            // Add leading spaces for proper alignment
            for (int k = 0; k < numRows - i - 1; k++) {
                System.out.print("  "); // Two spaces for each number
            }

            for (int j = 0; j < triangle[i].length; j++) {
                System.out.printf("%4d", triangle[i][j]); // Format to align numbers
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}