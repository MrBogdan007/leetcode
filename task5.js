/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order. 
Input: nums = [3,2,4], target = 6
Output: [1,2]
*/

// parallel population hashmap 
const task5 = (nums, target) => {
const hashmap = new Map();

for(let i = 0; i <= nums.length-1; i++){
   const complement = target - nums[i];
   if(hashmap.has(complement)){
      return[hashmap.get(complement), i]
   }
   else{
      hashmap.set(nums[i], i)
   }
}
return "Match is not found";

}
console.log(task5([3,2,4], 6));

//The time complexity of this algorithm is O(n)
//The space complexity is also O(n) in the worst case. 
//This is because, in the worst scenario, all elements of the array could be stored in the hashmap. 

//hashmap two pass approach
const task5FillFirst = (arr, target) => {
const hashmap = new Map();

for(let i = 0; i < arr.length; i++){
   hashmap.set(arr[i], i);
}

for (let i = 0; i < arr.length; i++){
let complement = target -  arr[i];

if(hashmap.has(complement) && i != hashmap.get(complement)){
      return [i, hashmap.get(complement)]

}
}
return "Not found";
}
console.log(task5FillFirst([3,2,4], 6));
//time complexity O(n) two loops of same input size 
//space compexity O(n) from hasmap n size ( In the worst case, the hashmap stores n key-value pairs.)