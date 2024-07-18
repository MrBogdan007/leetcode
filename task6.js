/*Given an integer x, return true if x is a 
palindrome
, and false otherwise.
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.*/

const task7 = (num)=> {

let copyInteger = num.toString().split("").reverse().join("");
if(copyInteger === num) {
   return true
}else{
   return false;
}
}
console.log(task7(123));


const task7NoConvert = (num) => {
let reverse = 0;
let copy = num;
while(copy>0) {
   let lastDigit = copy % 10;
   reverse =  reverse * 10 + lastDigit;
   copy = Math.floor(copy / 10);
}
return reverse === num;
}
console.log(task7NoConvert(121));
