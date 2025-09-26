Approach

We can use a hash map (dictionary) to store numbers we've seen so far and their indices. For each number x at index i, we check if target - x is already in the map. If it is, we've found a pair.

Time complexity: O(n)
Space complexity: O(n)

Edge cases:
- Multiple identical numbers.
- Negative numbers and zero.
- Large arrays (performance).
