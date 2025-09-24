package w3school.array.PascalTriangles;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        PTRow(5);
    }

    private static void PTRow(int numRows) {
    List<List<Integer>> PT = new ArrayList<>();
    //populate PT
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
            //sum of 2 previous
                int sum = PT.get(i-1).get(j) + PT.get(i-1).get(j-1);
                row.add(sum);
            }
            if(i>0){
            row.add(1);}

            PT.add(row);
        }
        System.out.println(PT);

        for (int i = 0; i < PT.size(); i++) {
            List<Integer> row = PT.get(i);

            // print spaces for centering
            for (int s = 0; s < numRows - i - 1; s++) {
                System.out.print("  ");
            }

            // print numbers
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }

    }

}
