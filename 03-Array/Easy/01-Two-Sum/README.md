# Two Sum

LeetCode: #1

Difficulty: Easy

Topic: Array, HashMap

## Problem

Given an array of integers and a target value, find two numbers
whose sum is equal to the target and return their indices.

## Example

Input:
nums = [3, 2, 4]
target = 6

Output:
[1, 2]

Because:

2 + 4 = 6

## Approach 1: Brute Force

Check every possible pair using two loops.

Time Complexity: O(n²)

Space Complexity: O(1)

## Approach 2: HashMap

Store each number and its index in a HashMap.

For every element, calculate:

needed = target - current element

Then check whether needed already exists in the HashMap.

Time Complexity: O(n) average

Space Complexity: O(n)

## What I Learned

- How to check all pairs using nested loops.
- How HashMap can reduce the time complexity.
- How to use target - current element to find the required number.