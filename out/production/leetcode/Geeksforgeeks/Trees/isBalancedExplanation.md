Go deep into Height(root.left) to the last element. After than unwinding begins:
most left's element(deepest in the tree) right element returns null.
Counting that most left and it's right element with Math.max(leftHeight, rightHight) + 1
![img_7.png](img_7.png)
Unwinding forward. Unwinding continues each time from the int leftHeight = Height(root.left);
and checks int rightHight = Height(root.right); of that left element. Each time increasing
Math.max(leftHeight, rightHight) + 1 , on each unwind.
