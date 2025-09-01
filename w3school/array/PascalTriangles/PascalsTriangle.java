package w3resource.array.PascalTriangles;

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
            //Every non-edge number in Pascal’s Triangle is the sum of the two numbers above it.
            //Which mirrors the mathematical rule:
            //C(n, k) = C(n-1, k-1) + C(n-1, k)
            //triangle[i - 1][j - 1] → the number above-left
            //triangle[i - 1][j] → the number above-right
        }

        // Print the Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            // Add leading spaces for proper alignment
            for (int k = 0; k < numRows - i - 1; k++) {
                System.out.print("  "); // Two spaces for each number
            }

            for (int j = 0; j < triangle[i].length; j++) {
                //Prints each number in the current row with 4-character width for proper spacing.
                // Format to align numbers
                System.out.printf("%4d", triangle[i][j]);
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}