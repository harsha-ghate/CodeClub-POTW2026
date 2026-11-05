// Problem: Check if N and Its Double Exist
// LeetCode: 1346
// Difficulty: Easy
// Approach: Check whether the array contains
//  an element that is double another element.

import java.util.Arrays;

class Solution {
    public boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {

            int target = 2 * arr[i];

            int low = 0;
            int high = arr.length - 1;

            while(low <= high) {

                int mid = low + (high - low) / 2;

                if(arr[mid] == target && mid != i) {
                    return true;
                }
                else if(arr[mid] < target) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}
