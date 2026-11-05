// Problem: Water Bottles
// LeetCode: 1518
// Difficulty: Easy
// Approach:
//  Simulate the exchange of
// empty bottles for full bottles until 
// no more exchanges are possible.

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int total = numBottles;
        int empty = numBottles;

        while(empty >= numExchange) {

            int newBottles = empty / numExchange;

            total += newBottles;

            empty = empty % numExchange + newBottles;
        }

        return total;
    }
}
