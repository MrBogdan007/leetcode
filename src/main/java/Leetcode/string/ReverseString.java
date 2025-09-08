package Leetcode.string;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
        reverseStringInPlace(new char[]{'h','e','l','l','o'});
    }
    public static void reverseString(char[] s) {
        char[] temp = new char[s.length];
        int j = s.length - 1;
        int i = 0;
        while (i < s.length) {
            temp[i] = s[j];
            i++;
            j--;
        }
        System.out.println(Arrays.toString(temp));

    }
    public static void reverseStringInPlace(char[] s) {

        int j = s.length - 1;
        int i = 0;
        char temp;
        while (i <= j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(s));

    }
}
