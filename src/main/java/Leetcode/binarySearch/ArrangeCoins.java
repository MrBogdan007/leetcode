package Leetcode.binarySearch;

public class ArrangeCoins {
    public static void main(String[] args) {
       int rows =  arrangeCoins(5);
       int rows2 =  arrangeCoins(8);
        System.out.println(rows);
        System.out.println(rows2);
    }

    //EZ SOLO solved
    public static int arrangeCoins(int n) {
        int rows = 0;

        //how to populate rows?
        // for loop ? recursion?
        int rowsIterator = 1;

      while (n>=0){
          int numberOfRowCoins = n - rowsIterator;
          if(n > 0 ){
            if(numberOfRowCoins < 0){
                return rows;
            }
            n = numberOfRowCoins;
            rowsIterator++;
            rows++;
          }
          if (n==0 ){
              return rows;
          }
      }
      return rows;
    }

    //K = number of rows
    //In the code, mid represents a guess for how many full rows of coins you can build.
    //triangular number formula
    // Using the area of a triangle formula, we get: (K²)/2 = N
    //This doesn't work because there is a diagonal line that isn't counted
//    We can count in this diagonal line by increasing the base of our staircase by 1, leaving us with: K * (K+1)/2 = N
    //Guess a number of full rows (mid)
    //
    //Check if we have enough coins
    //
    //Then:
    //
    //Try bigger → if possible
    //
    //Try smaller → if not possible
    public int arrangeCoins2(int n) {
        long start = 1;
        long end = n;
        long ans = 0;
        long mid = 0;

        while(start <= end) {
            mid = start + (end-start)/2;

            long coinCount = (mid*(mid+1))/2;

            if(coinCount <= n){
                ans = mid;
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return (int)ans;
    }

}
