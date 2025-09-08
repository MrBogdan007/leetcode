(lo_num + hi_num) >>> 1 means 
"take the average of lo_num and hi_num, 
but use bit shifting instead of division."


What (lo_num + hi_num) >>> 1 really does

>>> is Java’s unsigned right-shift. Shifting right by 1 bit is the same as integer division by 2, discarding the remainder.

So (lo + hi) >>> 1 means: add lo and hi, then divide by 2 using a bit shift (zero-filling the top bit).

For non-negative integers (like array indices), this is equivalent to:

(lo + hi) / 2


but with truncation toward zero—i.e., it computes floor((lo + hi) / 2).

Why a shift equals divide-by-2

Binary digits are powers of two. Shifting right by 1 drops the least-significant bit:

0111₂ (7) >>> 1 → 0011₂ (3) ← floor(7/2) = 3

0101₂ (5) >>> 1 → 0010₂ (2) ← floor(5/2) = 2

More generally, x >>> k ≙ floor(x / 2^k) for non-negative x.