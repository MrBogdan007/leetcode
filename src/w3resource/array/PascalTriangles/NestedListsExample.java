package w3resource.array.PascalTriangles;

import java.util.ArrayList;
import java.util.List;

public class NestedListsExample {
    public static void main(String[] args) {
        // Declaration and initialization of a List of Lists of Integers
        List<List<Integer>> listOfListsOfIntegers = new ArrayList<>();

        // Adding inner lists to the outer list
        List<Integer> innerList1 = new ArrayList<>();
        innerList1.add(1);
        innerList1.add(2);
        listOfListsOfIntegers.add(innerList1);

        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(10);
        innerList2.add(20);
        innerList2.add(30);
        listOfListsOfIntegers.add(innerList2);

        // Accessing elements
        System.out.println("First element of the first inner list: " + listOfListsOfIntegers.get(0).get(0)); // Output: 1
        System.out.println("Third element of the second inner list: " + listOfListsOfIntegers.get(1).get(2)); // Output: 30

        // Iterating through the nested list
        for (List<Integer> innerList : listOfListsOfIntegers) {
            for (Integer number : innerList) {
                System.out.print(number + " ");
            }
            System.out.println(); // New line after each inner list
        }
    }
}