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