package w3resource.array.PascalTriangles;

import java.util.ArrayList;
import java.util.List;

public class PTL {
    public static void main(String[] args) {

        System.out.println(getRow(3));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                int middleNumber = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                row.add(middleNumber);
            }
            if(i>0){
                row.add(1);
            }

            triangle.add(row);
        }
        return triangle.get(rowIndex);
    }
}
