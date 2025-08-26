The "classic" way:

Many examples online compute the midpoint as:

int middle = (start + end) / 2;


This works fine most of the time.
But if start and end are both very large integers, their sum (start + end) might overflow the maximum value an int can hold.

Integer overflow example

In Java, the maximum int value is:

Integer.MAX_VALUE = 2,147,483,647


Imagine:

start = 2_000_000_000;
end   = 2_100_000_000;


Now:

start + end = 4,100,000,000  ❌


But int in Java only goes up to ~2.1 billion, so this wraps around into a negative number (overflow).
That would cause middle to be wrong and break the binary search.

The safer formula

Instead of (start + end) / 2, we write:

int middle = start + (end - start) / 2;


Here’s why it’s safe:

end - start is at most the size of the array (which is usually much smaller than Integer.MAX_VALUE).

Adding start back will never exceed the maximum unless the array itself is absurdly huge.

Using the earlier numbers:

end - start = 100,000,000
(start + (end - start) / 2) = 2,050,000,000 ✅ (still safe, no overflow)


✅ In practice, for normal arrays, (start + end) / 2 is totally fine.
But the safer form is considered best practice in coding interviews, competitive programming, and systems code, because it guarantees no overflow.