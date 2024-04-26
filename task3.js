/*
Given an array of sorted numbers and a target sum, find a 
pair in the array whose sum is equal to the given target.
*/
// blunt approach
const pairSum = (array, target) =>
{
   for(let i = 0; i < array.length; i++){
      for(let j = i+1; j < array.length; j++){
         if(array[i] + array[j] === target){
            return true
         }
      }
   }
   return false;
}
console.log(pairSum([1,3,7,8,12], 10));

/*twopointer approach */
const pairSumFast = (array, target) => {
let end = array.length - 1;
let start = 0;

while(end > start){
let sum = array[start] + array[end]; 
  if(sum === target){
   return [array[start], array[end]];
  }
  else if(sum > target){
   end--;
  }
  else {
   start++;
  }
}
return false;
}
console.log(pairSumFast([1,3,7,8,12], 10));