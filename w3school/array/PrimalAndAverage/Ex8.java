package w3resource.array.PrimalAndAverage;

public class Ex8 {
    public static void main(String[] args) {
        //Write a Java program to calculate the weighted average of numbers in an array.
        double weight = 0.2;
        int [] arr = new int[]{1,6,2,3,7};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=  arr[i] * weight;
        }
        System.out.println(sum/weight);
    }
}
