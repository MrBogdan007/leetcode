package w3school.array.commonElements;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class CommonElements {
    //Write a Java program to find common elements between two arrays (string values).
    //Write a Java program to find common words between three different arrays of strings.
    //Write a Java program to find and count the number of common elements between two arrays.
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        String[] array3 = {"Python", "SQL", "JAVA", "Oracle", "JavaScript", "DB2", "JAVA"};

//        commonElements(array1,array2);
//        commonWords(array1,array2,array3);
//        commonWords2(array1,array2,array3);

        int[] array1n = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2n = {1, 0, 6, 15, 6, 4, 7, 0};
//        commonNumbers(array1n,array2n);
//        unionElements(array1n,array2n);
//        intersectElements(array1n,array2n);
        commonElementsCount(array1n,array2n);
    }
//Set<Integer> set = Arrays.stream(array1n).boxed().collect(Collectors.toSet());
    private static void intersectElements(int[] array1n, int[] array2n) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num: array1n) set1.add(num);

        HashSet<Integer> set2 = new HashSet<>();
        for (int num : array2n) set2.add(num);
        set1.retainAll(set2);
        System.out.println("Common elements: " + set1);
    }

    private static void commonElementsCount(int[] array1n, int[] array2n){
        HashMap<Integer,Integer> commonElMap = new HashMap<>();
                //1:1 - value which we get by key array1n[i]
                //2:1
                //5
        for (int i = 0; i < array1n.length; i++) {
            commonElMap.put(array1n[i], commonElMap.getOrDefault(array1n[i],0)+1);
            commonElMap.put(array2n[i], commonElMap.getOrDefault(array2n[i],0)+1);
            // if array1n[i] already exist it i will print array1n[i] and add 1 to it  and if it doesnt exist it will add 1 to it

        }
        System.out.println(commonElMap);
    }

    private static void unionElements(int[] array1n, int[] array2n) {
        HashSet<Integer> arrUnion = new HashSet<>();

        for (int num: array1n){
            arrUnion.add(num);
        }
        for (int num: array2n){
            arrUnion.add(num);
        }
        System.out.println(arrUnion+" :Union");
    }

    private static void commonNumbers(int[] array1n, int[] array2n) {

        for (int i = 0; i < array1n.length; i++) {
            for (int j = 0; j < array2n.length ; j++) {
                if(array1n[i]==array2n[j]){
                    System.out.println("Common number found: " + array1n[i]);
                }
            }
        }
    }

    private static void commonWords(String[] array1, String[] array2, String[] array3) {
        List<String> commonWords  = new ArrayList<>();
        for (String str: array1){
            commonWords.add(str);
        }
        for (String str: array2){
            commonWords.add(str);
        }
        for (String str: array3){
            commonWords.add(str);
        }

        System.out.println(commonWords);
    HashSet<String> noDuplicate = new HashSet<>();
        for (int i = 0; i < commonWords.size(); i++) {
            for (int j = i+1; j < commonWords.size(); j++) {
                if(Objects.equals(commonWords.get(i), commonWords.get(j))){
                    noDuplicate.add(commonWords.get(i));
                }
            }
        }
        System.out.println(noDuplicate);
    }
    private static void commonWords2(String[] array1, String[] array2, String[] array3) {
        Set<String> arr1 = new HashSet<>(Arrays.asList(array1));
        Set<String> arr2 = new HashSet<>(Arrays.asList(array2));
        Set<String> arr3 = new HashSet<>(Arrays.asList(array3));
        System.out.println(arr1);
        arr1.retainAll(arr2);
        arr1.retainAll(arr3);
        System.out.println(arr1);
    }

    private static void commonElements(String[] array1, String[] array2) {

        for (int i = 0; i < array1.length; i++) {
            for (int j = i+1; j < array2.length ; j++) {
                if(StringUtils.equals(array1[i],array2[j])){
                    System.out.println("Common elements: "+ array1[i]);
                }

            }
        }
    }
}
