const closestPair = (arr,x) => {
let start = 0;
let end = arr.length - 1; 
let diff = Number.MAX_VALUE;
let result = 0;
while (start < end){
   if(Math.abs(arr[end] + arr[start] - x) < diff ){
         diff = Math.abs(arr[end] + arr[start] - x);
         result =  `${arr[start] } + ${arr[end]}`
   }
   if(arr[start] + arr[end] > x){
      end --; 
   }else {
      start++;
   }
}
return result;
}
console.log(closestPair([10, 22, 25, 28, 30, 40], 54))