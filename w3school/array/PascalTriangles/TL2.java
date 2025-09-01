package w3resource.array.PascalTriangles;

import java.util.ArrayList;
import java.util.List;

public class TL2 {
    public static void main(String[] args) {
        int numsOfRows = 6;
        System.out.println(pascalTriangleLists(numsOfRows));
    }
    public static List<List<Integer>> pascalTriangleLists(int numsOfRows){
        List<List<Integer>> triangleList = new ArrayList<>();
        //populate array
        for (int i = 0; i < numsOfRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i; j++) {
                int singleDigitAbove = triangleList.get(i-1).get(j-1)+ triangleList.get(i-1).get(j);
                list.add(singleDigitAbove);
            }
            if(i>0){
                list.add(1);
            }
            triangleList.add(list);
        }
        //print array
//        List<Integer> lastList = triangleList.getLast();
//        for (Integer element: lastList){
//            System.out.printf("%4d",element);
//        }
        return triangleList;
    }
}
