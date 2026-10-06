# Best Time to Buy and Sell Stock

LeetCode: #121

Difficulty: Easy

Topic: Array, Greedy

## Problem

Given an array of stock prices where prices[i] represents the price of the stock on day i, find the maximum profit that can be achieved by buying on one day and selling on a later day.

You can only buy once and sell once.

## Example

Input:
prices = [7, 1, 5, 3, 6, 4]

Output:
5

Explanation:

Buy at 1 and sell at 6.

Profit = 6 - 1 = 5

## Approach 1: Brute Force

Check every possible pair of buying and selling days.

For each pair:

profit = selling price - buying price

Keep track of the maximum profit found.

### Complexity

Time Complexity: O(n²)

Space Complexity: O(1)

## Approach 2: Optimized

Traverse the array only once.

Keep track of:

- minPrice = minimum stock price seen so far
- maxProfit = maximum profit found so far

For every price:

1. Update minPrice if the current price is smaller.
2. Calculate the profit if we sell at the current price.
3. Update maxProfit if the current profit is greater.

### Complexity

Time Complexity: O(n)

Space Complexity: O(1)

## Example Walkthrough

prices = [7, 1, 5, 3, 6, 4]

Minimum price seen = 1

Best transaction:

Buy at 1
Sell at 6

Maximum Profit = 5

## Edge Case

Input:

prices = [7, 6, 4, 3, 1]

Output:

0

There is no profitable transaction, so the maximum profit is 0.

## What I Learned

- How to check all possible buy and sell combinations.
- Why the buying day must come before the selling day.
- How to reduce O(n²) to O(n).
- How to track the minimum value seen so far.
- How to solve the problem using constant extra space.