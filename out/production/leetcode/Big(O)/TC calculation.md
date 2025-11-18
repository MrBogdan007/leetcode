Big-O describes how runtime grows as input size grows.
If you have two independent inputs — say, arrays of size m and n —
you must account for both.

O(m × n):

for (int n : nums2) {
if (al1.contains(n)) {   // O(n)
result.add(n);
al1.remove(Integer.valueOf(n)); // O(n)
}
}

contains(n)	O(m) (linear search)
remove(n)	O(m) (linear shift/removal)

 Correct formal TC: O(m + n)
Acceptable informal TC (if m ≈ n): O(n) 
and you clarify that n = total number of elements in both arrays