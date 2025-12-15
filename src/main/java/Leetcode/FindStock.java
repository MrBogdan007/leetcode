package Leetcode;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindStock {
    public static void main(String[] args) {
       int result =  maxProfit(new int[]{7,1,5,3,6,4});
       int result2 =  maxProfit(new int[]{7,6,4,3,1});
        System.out.println(result);
        System.out.println(result2);
    }


    private static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

    private static int maxProfitWithSell(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            if(prices[i] > buy && prices[i] > sell){
                sell = prices[i];
            }
            if(sell - buy > 0){
                profit  = sell- buy;
            }
        }
        return profit;
    }
    public static int maxProfitBrute(int[] prices) {
        int min = Arrays.stream(prices).min().orElse(-1);
        int minIndex = 0;

        for (int i = 0; i < prices.length; i++) {
            if(min==prices[i]){
                minIndex = i;
            }
        }
        int maxNumberAfterIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if(minIndex< i && prices[i] > min && maxNumberAfterIndex < prices[i] ){
                maxNumberAfterIndex = prices[i];
            }
        }
        if(maxNumberAfterIndex > 0){
            return maxNumberAfterIndex-min;
        }else {
            return 0;
        }

    }
}
