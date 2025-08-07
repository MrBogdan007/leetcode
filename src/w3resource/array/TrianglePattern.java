package w3resource.array;

public class TrianglePattern {
    public static void main(String[] args) {
        int [][] trianglePattern = new int [10][10];
        for (int i = 1; i <= trianglePattern.length; i++) {
            for (int j = 1; j <= trianglePattern.length; j++) {
                if(j<=i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
