// Problem: Height Checker
// LeetCode: 1051
// Difficulty: Easy
// Approach: Compare the original array with its
//  sorted version to count mismatched positions.

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {

        int[] arr = heights.clone();

        Arrays.sort(arr);

        int count = 0;

        for(int i = 0; i < heights.length; i++) {

            if(heights[i] != arr[i]) {
                count++;
            }
        }

        return count;
    }
}
