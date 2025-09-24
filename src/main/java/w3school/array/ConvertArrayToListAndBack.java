package w3school.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToListAndBack {

    //Write a Java program to convert an array of primitive data types into an ArrayList.
    public static void main(String[] args) {
        String[] my_array = new String[] {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        int[] my_array2 = {
                10789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        List<String> arrList = new ArrayList<>(Arrays.asList(my_array));
        System.out.println(arrList);
        List<Integer> integerList = Arrays.stream(my_array2).boxed().toList();
        System.out.println(integerList);

        ArrayList<String> list = new ArrayList<String>();

        // Add strings to the ArrayList.
        list.add("Python");
        list.add("Java");
        list.add("PHP");
        list.add("C#");
        list.add("C++");
        list.add("Perl");
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        for (String str : strArr ){
            System.out.println(str);
        }

    }
}
