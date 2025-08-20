package w3resource.array.Printing2DArrays;

public class Ex3 {
    public static void main(String[] args) {
        //Print a 10x10 grid of dashes
        int [][] mult = new int [10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("- ");
            }
            System.out.println();
        }

    }
}
