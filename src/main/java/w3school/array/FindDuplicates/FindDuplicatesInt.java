package w3school.array.FindDuplicates;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicatesInt {
    //Write a Java program to find duplicate values in an array of integer values.
    //Write a Java program to count the number of duplicate values in an integer array.
    //Write a Java program to find duplicate values in an array of string values.
    //Write a Java program to find duplicate words in a sentence.
    //Write a Java program to count how many times each string appears in an array.
    //Write a Java program to remove duplicate strings while maintaining the original order.
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        String sentence = "Shla Sasha oi soshe i Sasha i upala";
//        findDuplicates(my_array1);
//        findDuplicatesStream(my_array1);
//        countDuplicateHash(my_array1);
//        countDuplicateStringArray(my_array);
//        countDuplicateStringArrayStreams(my_array);
//        countDuplicateWord(sentence);
//        countDuplicateWordHashMap(sentence);
//        countArrayStrings(my_array);
//        countArrayStringsStream(my_array);
        removeDuplicateString(my_array);

    }

    private static void removeDuplicateString(String[] myArray) {
        Set<String> arraySet = new HashSet<>(Arrays.asList(myArray));
        System.out.println(arraySet);
    }

    private static void countArrayStringsStream(String[] myArray) {
        Map<String,Long> strCountStreams = Arrays.stream(myArray).collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(strCountStreams);
    }

    private static void countArrayStrings(String[] myArray) {
        HashMap<String,Integer> strCount = new HashMap<>();
        for (String str: myArray){
            strCount.put(str, strCount.getOrDefault(str,0)+1);
        }
        System.out.println(strCount);
    }

    private static void countDuplicateWordHashMap(String sentence) {
    HashMap<String, Integer> dCount = new HashMap<>();
    String [] parts  = sentence.toLowerCase().trim().split("\\s+");
    for (String word: parts){
        dCount.put(word, dCount.getOrDefault(word, 0)+1);
    }
    for (Map.Entry<String,Integer> entry: dCount.entrySet()){
        if(entry.getValue()>1){
            System.out.println("Duplicate word: "+ entry.getKey()+ " Count: "+ entry.getValue());
        }

    }

    }

    private static void countDuplicateWord(String sentence) {
        String [] parts = sentence.split(" ");
        for (int i = 0; i < parts.length; i++) {
            for (int j = i+1; j < parts.length; j++) {
                if (StringUtils.equals(parts[i], parts[j])) {
                    System.out.println("Duplicate word found: "+ parts[i]);
                }
            }
        }
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
        Map<String, List<String>> counts2 = Arrays.stream(myArray)
                .collect(Collectors.groupingBy(s -> s));
        counts2.entrySet().stream()
                .forEach(stringListEntry -> System.out.println(stringListEntry.getValue()));
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
