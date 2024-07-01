/*Given a sorted array A (sorted in ascending order), having N integers, 
find if there exists any 
pair of elements (A[i], A[j]) such that their sum is equal to X.*/
const task1 = (A,X) => {
let start = 0; 
let end = A.length - 1;
console.log(end);
while(start < end){
 const sum = A[start] + A[end];
 if(sum === X){
   return `Founded match: " + ${A[start]}  + ${A[end]}`;
 }else if(sum < X){
   start++;
 }
 else {
   end--;
 }
}
return "Match not found";
}

console.log(task1([2,3,8,13,15],21))

/*Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2^x.*/

//Follow up: Could you solve it without loops/recursion?
const task2 = (n) => {
for (let x = 1; x <= n; x = x*2){
   if(n = 1 ){
      return true;
   }
   if(n === x){
      return true;
   }

}
return false;
}
const task2Bit = (n) => {
   return n > 1 && (n&n-1) === 0;
}

console.log(task2Bit(15))
console.log(task2(16))

/*
Given an array of sorted numbers and a target sum, find a 
pair in the array whose sum is equal to the given target.
*/
const task3 = (arr,target) => {
let start = 0;
let end = arr.length - 1;
while (start < end){
   let sum = arr[start] + arr[end];
   if(sum === target ){
      return true;
   }
   else if(sum <  sum){
      start++;
   }else{
      end--;
   }
}
return "Not found";
}

console.log(task3([2,5,12,16,21],13))


/* Given a string s containing just the characters '(', ')', '{', '}', '[' , ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/

const task4 = (s) => {
const arr = [];
for(let i of s){
   if(i === "(" || i === "[" || i === "{"){
      arr.push(i);
   }
   else {
      if(i === ")" && arr[arr.length - 1] != "(" || 
      i === "}" && arr[arr.length - 1] != "{"||
      i === "]" && arr[arr.length - 1] != "["  ){
         return false;
      }
      arr.pop();
   }
  
}
return !arr.length; 
}
console.log(task4("()[()]"))

var isValid = function(s) {
   const array = [];
   for (let i of s){
     if(i=== "(" || i=== "[" || i === "{"){
       array.push(i);
     }
     else{
       if(i=== ")" && array[array.length - 1] !== "(" || i === "]" && array[array.length-1] !== "[" 
       || i === "}" && array[array.length -1] !== "{"){
         return false;
       }
       array.pop();
     }
   }
   return !array.length;
 };
 console.log(isValid("()[()]"))

 