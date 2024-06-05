/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/
//stack data structure approach
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
