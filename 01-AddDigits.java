// Problem: Add Digits
// LeetCode: 258
// Difficulty: Easy
// Approach: Repeatedly calculate 
// the sum of digits until a single digit remains.

class Solution {
    public int addDigits(int num) {

        while(num >= 10) {

            int sum = 0;

            while(num > 0) {
                int rem = num % 10;
                sum += rem;
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }
}
