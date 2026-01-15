max value for left is always gonna be -1 from:
isBSTUtil(10, -∞, +∞)   
     isBSTUtil(5, -∞, 9) - left part executed with maximum -1 
                         == All nodes in the left subtree have values smaller than the root.
     than right return executed
     && isBSTUtil(20, 11, +∞) - left part executed with minimum -1
                              =All nodes in the right subtree have values greater than the root.
So, we remove one and set max for left subtree so it will be smaller than the root
And add one to the minimum value of right subtree , so it will be greater than the root

removing and adding from root  = node.val - 1(max), node.val = + 1 (min)


Binary Search splits by index
BST validation checks by value range:
 [min, max]
if (node.val < min || node.val > max) return false;

isBSTUtil(node.left, min, node.val - 1)
isBSTUtil(node.right, node.val + 1, max)
That trick was just to ensure no duplicates, since all values must be distinct.

But we can simplify it — and most programmers don’t use ±1.

