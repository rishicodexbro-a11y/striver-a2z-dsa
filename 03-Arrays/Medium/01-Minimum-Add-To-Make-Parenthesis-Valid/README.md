# Minimum Add to Make Parentheses Valid

LeetCode: #921

Difficulty: Medium

Topic: String, Stack, Greedy

## Problem

Given a string `s` containing only `(` and `)`, find the minimum number of parentheses that must be added to make the string valid.

A valid parentheses string must have:

- Every `(` matched with a `)`.
- Every `)` matched with a previous `(`.

## Example

Input:

```text
s = "())"
```

Output:

```text
1
```

Explanation:

Add one `(` at the beginning:

```text
(()) 
```

The string becomes valid.

## Approach 1: Brute Force / Stack

Use a stack to keep track of unmatched opening parentheses.

For every character:

- If it is `(`, push it into the stack.
- If it is `)`:
  - If the stack is not empty, remove one `(`.
  - Otherwise, we need to add an opening `(`.

After traversing the string, any remaining `(` in the stack need a closing `)`.

### Complexity

Time Complexity: O(n)

Space Complexity: O(n)

## Approach 2: Optimized

Instead of using a stack, keep two counters:

- `open` = number of unmatched `(`.
- `close` = number of `)` that do not have a matching `(`.

For every character:

1. If it is `(`, increase `open`.
2. If it is `)` and `open > 0`, match it with an opening parenthesis by decreasing `open`.
3. Otherwise, increase `close`.

At the end:

```text
answer = open + close
```

### Complexity

Time Complexity: O(n)

Space Complexity: O(1)

## Example Walkthrough

Input:

```text
s = "())"
```

Process:

```text
(  → open = 1
)  → open = 0
)  → close = 1
```

At the end:

```text
open + close = 0 + 1 = 1
```

Answer:

```text
1
```

## Another Example

Input:

```text
s = "((("
```

There are three unmatched opening parentheses.

```text
open = 3
close = 0
```

Answer:

```text
3
```

We need to add three `)`.

## What I Learned

- How to check whether parentheses are balanced.
- How a stack can be used to match parentheses.
- How to optimize a stack solution to O(1) extra space.
- How to track unmatched opening and closing parentheses.
- The importance of handling unmatched `)` immediately.