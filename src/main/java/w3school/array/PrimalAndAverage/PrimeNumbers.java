package w3school.array.PrimalAndAverage;
//Write a Java program to find the average of prime numbers in an integer array.
public class PrimeNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i%j==0){
                    isPrime= false;
                    break;
                }
            }
            if(isPrime){
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}
