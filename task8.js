
//main logic
// class ListNode {
//    constructor(data){
//       this.data = data;
//       this.next = null;
//    }
   
// }
//  function ListNode(val, next) {
//    this.val = (val===undefined ? 0 : val)
//     this.next = (next===undefined ? null : next)
//  }

// /**
//  * @param {ListNode} head
//  * @param {number} n
//  * @return {ListNode}
//  */
// const linkedList =  ( head, n) => {
//    const dummy = new ListNode(0);
//     dummy.next = head;
//     console.log(dummy); 
//     let first = dummy;
//     let second = dummy;

//     for (let i = 0; i <= n; i++) {
//         first = first.next;
//     }

//     while (first !== null) {
//         first = first.next;
//         second = second.next;
//     }

//     second.next = second.next.next;

//     return dummy.next;
// }
// console.log(linkedList([1,2,3,4,5], 2));


// printing part
class ListNode {
    constructor(val = 0, next = null) {
        this.val = val;
        this.next = next;
    }
 }
 
 const arrayToLinkedList = (arr) => {
    if (arr.length === 0) return null;
    const dummy = new ListNode();
    let current = dummy;
    for (let value of arr) {
        current.next = new ListNode(value);
        current = current.next;
    }
    return dummy.next;
 };
 const linkedList2 = arrayToLinkedList([1, 2, 3, 4, 5]);
 console.log(linkedList2);
 
 
 
 
 
 const removeNthFromEnd = (head, n) => {
    const dummy = new ListNode(0);
    dummy.next = head;
    let first = dummy;
    let second = dummy;
 
    for (let i = 0; i <= n; i++) {
        first = first.next;
    }
 
    while (first !== null) {
        first = first.next;
        second = second.next;
    }
 
    second.next = second.next.next;
 
    return dummy.next;
 };
 
 // Convert array to linked list
 const linkedList = arrayToLinkedList([1, 2, 3, 4, 5]);
 
 // Remove the nth node from the end
 const updatedLinkedList = removeNthFromEnd(linkedList, 2);
 








 // Helper function to convert linked list back to array for easy display
 const linkedListToArray = (head) => {
    const arr = [];
    let current = head;
    while (current !== null) {
        arr.push(current.val);
        current = current.next;
    }
    return arr;
 };
 



 
 // Display the updated linked list as an array
 console.log(linkedListToArray(updatedLinkedList)); // Output: [1, 2, 3, 5]
 