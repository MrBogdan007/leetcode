package w3resource.array;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,35,2,4,10,1000,555,1245};
        String [] arrOfStrings = {"apricot","banana","yohurt","ananas"};
        Arrays.sort(arrOfStrings);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrOfStrings));

    }
}
