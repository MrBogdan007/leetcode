package Leetcode.arrays;

public class TeemoAtacking {
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1,4},2));
        System.out.println(findPoisonedDuration(new int[]{1,2},2));
        System.out.println(findPoisonedDuration(new int[]{1,3},2));


    }

    //EZ SOLVED SOLO BY MEEEEEEEEEEEEEEEEEEEEEE
    //timeSeries[i]  = second
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        if(duration==0){
            return 0;
        }
        for (int i = 0; i < timeSeries.length-1; i++) {
            if(timeSeries[timeSeries.length-1]== timeSeries[i]){
                    result += duration;
            }
            else{
                int prevNextDiff = timeSeries[i+1] - timeSeries[i];
                if(prevNextDiff>= duration){
                    result += duration;
                }else{
                    result += prevNextDiff;
                }

            }

        }

        return result;
    }
    public static int findPoisonedDuration2(int[] timeSeries, int duration) {
        int result = 0;
        if(duration==0){
            return 0;
        }
        for (int i = 0; i < timeSeries.length-1; i++) {

            int prevNextDiff = timeSeries[i+1] - timeSeries[i];
            if(prevNextDiff>= duration){
                result += duration;
            }else{
                result += prevNextDiff;
            }


        }
        result += duration;

        return result;
    }
}
