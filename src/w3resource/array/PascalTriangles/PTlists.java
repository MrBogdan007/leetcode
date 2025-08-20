package w3resource.array.PascalTriangles;

import java.util.ArrayList;
import java.util.List;

public class PTlists {
    public static void main(String[] args) {
        int numOfRows = 6;
        List<List<Integer>> triangleLists = new ArrayList<>();

        // populate triangle
        for (int i = 0; i < numOfRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // first element always 1

            for (int j = 1; j < i; j++) {
                int val = triangleLists.get(i - 1).get(j - 1) + triangleLists.get(i - 1).get(j);
                row.add(val);
            }

            if (i > 0) {
                row.add(1); // last element always 1
            }

            triangleLists.add(row);
        }

        // print last row
        List<Integer> lastRow = triangleLists.get(numOfRows - 1);
        for (Integer num : lastRow) {
            System.out.printf("%4d", num);
        }
    }
}
