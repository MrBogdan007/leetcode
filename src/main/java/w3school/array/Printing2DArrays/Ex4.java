package w3school.array.Printing2DArrays;

public class Ex4 {
    public static void main(String[] args) {
        int [][] stars = new int [10][10] ;
        System.out.println(stars.length);
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars.length; j++) {
                if(j == i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
