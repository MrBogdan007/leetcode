package w3resource.array.PascalTriangles;

public class PT {
    public static void main(String[] args) {
        int numOfRows = 6;
        int [][] triangle = new int[numOfRows][];

        //populate triangle
        for (int i = 0; i < triangle.length; i++){
            triangle[i] = new int [i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++){
            triangle[i][j]= triangle[i-1][j]+triangle[i-1][j-1];
            }
        }
        for (int i = 0; i < triangle.length; i++) {
            for (int k = 0; k < numOfRows-i-1; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.printf("%4d",triangle[i][j]);
            }
            System.out.println();
        }
        //print triangle

    }
}
