Target < smallest element → insert at beginning.

Target > largest element → insert at end.

Target in-between → insert in correct position


middle index mathematically → (0 + 1) / 2 = 0.5 (between indices 0 and 1).
Arrays are 0-based indexed (first element is at index 0, second at 1, etc.).

For your array [1, 3]:

Start index = 0

End index = 1

Middle index = (0 + 1) / 2 = 0.5 → which means the middle lies between arr[0] and arr[1].

If arrays were 1-based indexed (like in some languages: MATLAB, Lua, Fortran), then:

Start index = 1

End index = 2

Middle index = (1 + 2) / 2 = 1.5 → also between the two elements.