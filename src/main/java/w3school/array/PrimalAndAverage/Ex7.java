package w3school.array.PrimalAndAverage;

public class Ex7 {
    public static void main(String[] args) {
        //Write a Java program to calculate the average value of array elements.
        int [] avrArray = new int[]{1,4,5,12};
        float sum = 0;
        for (int i = 0; i < avrArray.length; i++) {
            sum += avrArray[i];
        }
        System.out.println(sum/avrArray.length);
    }
}
