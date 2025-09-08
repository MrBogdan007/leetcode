package w3school.array.reverseInt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseIntegerEven {
//Write a Java program to reverse an array of integer values.

    public static void main(String[] args) {
        String a = "Banana";
        String b = "Banana";
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));



        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1.hashCode());          // same
        System.out.println(s2.hashCode());          // same
        System.out.println(System.identityHashCode(s1)); // different
        System.out.println(System.identityHashCode(s2)); // different


        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };
//        reverseInt(my_array1);
//        reverseIntStream(my_array1);
        reverseInPlace(my_array1);
//        int[] reversedEvens = reverseEvenIntegers(my_array1);
//        System.out.println(Arrays.toString(reversedEvens));
    }

    private static void reverseInPlace(int[] myArray1) {
    int j = myArray1.length-1;
    int i = 0;
    while (i<=j){
        int temp = myArray1[i];
        myArray1[i] = myArray1[j];
        myArray1[j] = temp;
        i++;
        j--;
    }

        System.out.println(Arrays.toString(myArray1));
    }

    private static void reverseIntStream(int[] myArray1) {
    List<Integer> listArray = Arrays.stream(myArray1).boxed().collect(Collectors.toList());
    Collections.reverse(listArray);
    System.out.println(listArray);
    }

    private static void reverseInt(int[] myArray1) {
        int lengthcounter = 0;
    for (int num: myArray1){
        if(num%2==0){
            lengthcounter++;
        }
    }
        System.out.println(lengthcounter);
    int[] arr  = new int[lengthcounter];


    int j = 0;
        for (int i = myArray1.length-1; i >= 0 ; i--) {
            if(myArray1[i]%2==0) {
                arr[j] = myArray1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int[] reverseEvenIntegers(int[] arr) {
        // Filter evens and box them into a list
        List<Integer> evens = Arrays.stream(arr)
                .filter(n->n%2==0)
                .boxed()
                .collect(Collectors.toList());

        // Reverse the list in-place
        Collections.reverse(evens);

        // Convert back to int[]
        return evens.stream().mapToInt(Integer::intValue).toArray();
    }
}
