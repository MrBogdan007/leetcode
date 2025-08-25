package arrays;

import java.util.Arrays;
import java.util.Random;

public class IntArrayWrapper {
    private int[] values;

    public IntArrayWrapper() {
        values = new int[7];
        Random rand = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = rand.nextInt(11); // 0–10 inclusive
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
    public int[] getValues(){
        return values;
    }
}
