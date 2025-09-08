package Leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayGenerator {
    public static int[] genArray(){

        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber = Math.toIntExact(Math.round(Math.random() * 10));
            listOfNumbers.add(randomNumber);
        }

        return new int[]{};

    }
}
