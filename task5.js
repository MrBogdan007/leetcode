/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order. 
Input: nums = [3,2,4], target = 6
Output: [1,2]
*/

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