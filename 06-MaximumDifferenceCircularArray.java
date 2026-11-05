// Problem: Maximum Difference Between Adjacent Elements in a Circular Array
// LeetCode:3423
// Approach: Compare adjacent elements,
//  including the last and first elements.

class Solution {
    public int maxAdjacentDistance(int[] nums) {

        int max = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {

            int diff = Math.abs(nums[i] - nums[(i + 1) % n]);

            max = Math.max(max, diff);
        }

        return max;
    }
}
