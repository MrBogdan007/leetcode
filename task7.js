//Given a sorted array, write a function that returns the index for the given element.

// blunt approach
//TC,SC = O(n)
const returnIndex = (array,element) => {
   for (let i = 0 ; i < array.length; i++ ){
      if(array[i] === element){
         return i;
      }
      
   }return false
}

console.log(returnIndex([1,4,6,91,7],91));


//binary search iterative approach
const returnIndex2 = (array,element) => {
let 
start = 0, 
end = array.length-1;

while (start <= end ){
   let middle = Math.floor((start + end) / 2);
   if(array[middle] === element ){
      return middle;
   }
   else if (array[middle] < element){
    start = middle + 1;
   }
   else{
      end = middle - 1;
   }

}
return "Not hereeeee";

}

console.log(returnIndex2([1,4,6,91,7],91));

const array = [1,3,5,6,91,123];
//binary search recursion
const returnIndex3 = (start, end , element) => {
   let middle = Math.floor((start+end)/2);

if(start > end) {
   return "Not found";
}
else if (array[middle] === element){
   return middle;
}
else if (array[middle] > element){
    return returnIndex3(start,middle - 1, 91);
}
else {
   return returnIndex3(middle + 1,end , 91);
}
}
console.log(returnIndex3(0,array.length - 1 , 91));