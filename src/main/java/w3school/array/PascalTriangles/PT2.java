package w3school.array.PascalTriangles;

public class PT2 {
    public static void main(String[] args) {
        int numOfRows = 6;
        int[][] triangle = new int[numOfRows][];

        //populate triangle
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        //print triangle
            for (int j = 0; j < triangle[numOfRows-1].length; j++) {
                System.out.printf("%4d", triangle[numOfRows-1][j]);
            }



    }
}
