/*Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2^x.*/

//Follow up: Could you solve it without loops/recursion?

//blunt approach 

const exponentOfTwo = (n) => {
   if(n=== 1){
      return true;
   }
   for (let i = 1; i <= n; i = i * 2){
    if(i === n){
      return true;
    }
   }
   return false;
}

console.log(exponentOfTwo(43));

// bit manupulation

const isPowerOfTwo = n => n > 0 ? !(n & n-1) : false;

console.log(isPowerOfTwo(43));
