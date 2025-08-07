package arrays;

public class PlusOne2 {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        if(digits[0]== 0){
            digits[0] = 1;
        }
        for (int i = 0; i < digits.length-1; i++) {
             if(digits[i] == 9) {
                 digits[i] = 0;

             }
             else {
                 digits[digits.length-1]++;
                 return digits;
             }
        }
        int [] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;

    }
}
