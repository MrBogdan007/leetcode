package Geeksforgeeks.TwoPointerProblems;

public class reverseStringSpaces {
//    Given a string s, the task is to reverse the given string while preserving the position of spaces.
//
//            Examples:
//
//    Input: "internship at geeks for geeks"
//    Output: skeegrofsk ee gtapi hsn retni
//    Explanation : Reversing the characters without spaces "skeegrofskeegtapihsnretni" and inserting space at original place"skeegrofsk ee gtapi hsn retni"
//
//    Input : "abc de"
//    Output: edc ba
//    Explanation : Reversing the characters without spaces "edcba" and inserting space at original place"edc ba"
//
//    Input  "Help others"
//    Output: sreh topleH
//    Explanation : Reversing the characters without spaces "srehtopleH" and inserting space at original place"sreh topleH"
    public static void main(String[] args) {
        String s = "internship at geeks for geeks";
//        reverses(s);
//        reverses2(s);
     String result = reverse3(s);
        System.out.println(result);
    }

    private static void reverses(String s) {
        int writeIndex = 0;
        char[] inputArray = s.toCharArray();
        char[] resultArray= new char[inputArray.length];
        // Mark spaces in result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                resultArray[i] = ' ';
            }
        }
        for (int i = inputArray.length-1; i >= 0; i--) {
            //ignore spaces at the end
            if(inputArray[i]!=' '){
                //igrore result array spaces
                if(resultArray[i] == ' '){
                    writeIndex++;
                }
                resultArray[writeIndex] = inputArray[i];
                writeIndex++;

            }

        }
        System.out.println(resultArray);

    }
    static void reverses2(String str)
    {

        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        // Mark spaces in result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Traverse input string from beginning
        // and put characters in result from end
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {

            // Ignore spaces in input string
            if (inputArray[i] != ' ') {

                // ignore spaces in result.
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
    }

    static String reverse3(String str){
        int start = 0;
        int end = str.length()-1;
        char[] result = str.toCharArray();
        while (start<end){
            if(result[start] == ' '){
               start++;

            } else if (result[end] == ' ') {
                end--;

            }else{
                char temp = result[end];
                result[start] = result[end];
                result[end] = temp;
                start++;end--;
            }

        }
        return String.valueOf(result);
    }


}
