package w3school.array.commonElements;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class CommonElements {
    //Write a Java program to find common elements between two arrays (string values).
    //Write a Java program to find common words between three different arrays of strings.
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        String[] array3 = {"Python", "SQL", "JAVA", "Oracle", "JavaScript", "DB2", "JAVA"};

//        commonElements(array1,array2);
        commonWords(array1,array2,array3);
        commonWords2(array1,array2,array3);
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
