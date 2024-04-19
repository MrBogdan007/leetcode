/*Given a sorted array A (sorted in ascending order), having N integers, 
find if there exists any 
pair of elements (A[i], A[j]) such that their sum is equal to X.*/

//blunt approach

const findPair = (A,N,X) => {
for (let i = 0; i < N; i++){
   for(let j = i+1; j < N; j++){
      if(A[i] + A[j] === X){
         return true;
      }
   }
}
return false;
}

console.log(findPair([1,2,4,9],4,6));

//two pointer approach

const findPair2 = (A,N,X) => {
   let start = 0;
   let end = N-1;
   while (end >= start){
      if(A[end] + A[start] === X){
         return true;
      }
      else if (A[end] + A[start] > X) {
          end--;
      }
      else{
         start++;
      }
   }
   return false;
}
console.log(findPair2([1,2,4,9],4,3));

//SC O(1) , TC O(N)