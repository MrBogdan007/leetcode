package w3school.array.FindDuplicates;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicatesInt {
    //Write a Java program to find duplicate values in an array of integer values.
    //Write a Java program to count the number of duplicate values in an integer array.
    //Write a Java program to find duplicate values in an array of string values.
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
//        findDuplicates(my_array1);
//        findDuplicatesStream(my_array1);
        countDuplicateHash(my_array1);
        countDuplicateStringArray(my_array);
        countDuplicateStringArrayStreams(my_array);

    }

    private static void countDuplicateStringArray(String[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            String s = myArray[i];

            for (int j = i+1; j < myArray.length; j++) {
                String s2 = myArray[j];
                if(StringUtils.equals(s, s2 )){
                    System.out.println("Duplicate found: " +  myArray[i]);
                }
            }
        }
    }
    private static void countDuplicateStringArrayStreams(String[] myArray) {
        Map<String, Long> counts = Arrays.stream(myArray)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        counts.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Duplicate found: " + entry.getKey()));
    }

    private static void countDuplicateHash(int[] myArray1) {
        HashMap<Integer,Integer> numberCount = new HashMap<>();

        for (int num: myArray1){
            numberCount.put(num,numberCount.getOrDefault(num,0)+1);

        }
        System.out.println(numberCount);
    }

    private static void findDuplicates(int[] myArray1) {
        for (int i = 0; i < myArray1.length; i++) {
            for (int j = i+1; j < myArray1.length; j++) {
            if(myArray1[i]==myArray1[j]&&i!=j){
                System.out.println("Duplicate found: "+ myArray1[j]);
            }
            }
        }
    }
    private static void findDuplicatesStream(int[] myArray1) {
        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates = Arrays.stream(myArray1)
                .filter(n -> !seen.add(n)) // if already present, it's duplicate
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(duplicates);
        }
}
