// function findClosestPair(arr1, arr2, x) {
//     let m = arr1.length;
//     let n = arr2.length;
    
//     // Initialize variables to keep track of the result
//     let closestPair = [arr1[0], arr2[0]];
//     let minDiff = Math.abs((arr1[0] + arr2[0]) - x);
//     // Iterate over each element in arr1
//     for (let i = 0; i < m; i++) {
//         // Iterate over each element in arr2
//         for (let j = 0; j < n; j++) {
//             // Calculate the sum of the current pair
//             let sum = arr1[i] + arr2[j];
            
//             // Calculate the absolute difference between the sum and x
//             let diff = Math.abs(sum - x);
            
//             // Update the result if the current difference is smaller
//             if (diff < minDiff) {
//                 minDiff = diff;
//                 closestPair = [arr1[i], arr2[j]];
//             }
//         }
//     }
    
//     return closestPair;
// }


//my blunt
// Example usage:
// let arr1 = [1, 4, 5, 7];
// let arr2 = [10, 20, 30, 40];
// let x = 32;

// let result = findClosestPair(arr1, arr2, x);
// console.log(`The pair whose sum is closest to ${x} is:`, result);


// function findClosestPair(arr1, arr2, x) {
//     let minSum = Math.abs(arr1[0] + arr2[0] - x);
//     let closestPairPlaceholder = 0;
//    for(let i = 0; i < arr1.length; i++) {
//     for(let j = 0; j < arr2.length; j++){
        
//         let currentMinSum = Math.abs(arr1[i] + arr2[j] - x) 
//         if(currentMinSum < minSum){
//             minSum = currentMinSum;   
//             closestPairPlaceholder = `${arr1[i]} + ${arr2[j]}`
//         }
//     }
//    }
    
//     return closestPairPlaceholder;
// }

// // Example usage:
// let arr1 = [1, 4, 5, 7];
// let arr2 = [10, 20, 30, 40];
// let x = 50;

// let result = findClosestPair(arr1, arr2, x);
// console.log(`The pair whose sum is closest to ${x} is:`, result);

// Two pointer
function findClosestPair(arr1, arr2, x) {
   let minSum = Math.abs(arr1[0] + arr2[0] - x);
   let closestPairPlaceholder = 0;
   let m = arr1.length;
   let start = 0 ;
   let end = arr2.length -1;

   while (end >= 0 && start < m) {
      let sum = Math.abs(arr1[start] + arr2[end]- x);
      if(sum < minSum){
         minSum = sum;
         closestPairPlaceholder = `${arr1[start]} + ${arr2[end]}`
      }
      if(arr1[start] + arr2[end] > x){
         end--;
      }
      else { start++;}
     
   }
   return closestPairPlaceholder;
}

// Example usage:
let arr2 = [1, 4, 5, 7];
let arr1 = [10, 20, 30, 40];
let x = 32;

let result = findClosestPair(arr1, arr2, x);
console.log(`The pair whose sum is closest to ${x} is:`, result);