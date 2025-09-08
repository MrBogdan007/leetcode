The while (temp_array[i] < pivot) line

Keep moving i to the right as long as numbers are smaller than the pivot.

The moment it stops, i is pointing to the first number that is ≥ pivot.



The while (temp_array[j] > pivot) line

This does the opposite:

Keep moving j to the left as long as numbers are greater than the pivot.

The moment it stops, j is pointing to the first number that is ≤ pivot.


How do we find the pair to swap?

Now both i and j have stopped:

i is at a number that’s on the wrong side (too big for the left side).

j is at a number that’s on the wrong side (too small for the right side).

Those are exactly the two numbers we need to swap.


Quick note: The choice of pivot is arbitrary — some implementations always take the first element, last element, or even pick randomly.
This code specifically picks the middle element’s value.