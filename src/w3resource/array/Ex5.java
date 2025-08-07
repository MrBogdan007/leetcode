package w3resource.array;

public class Ex5 {
    public static void main(String[] args) {
        int [][] checkerBoard = new int [8][8];
        for (int i = 1; i <= checkerBoard.length; i++) {
            for (int j = 1; j <= checkerBoard.length; j++) {
            if(j%2==0 ){
                System.out.printf("#");
            }else{
                System.out.printf(" ");
            }
            }
            System.out.println();
        }
    }
}
