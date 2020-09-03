package arrays;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of
 * the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 * Link: https://leetcode.com/problems/jump-game/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Topic: Array, Greedy
 */
public class CanReachEnd {
    public boolean canReachEnd(int[] array) {
        int i = array.length-1;
        int j = i-1;

        while(j >= 0) {
            if(i-j <= array[j]) {
                i = j;
            }
            j --;
        }

        return i == 0;
    }
}
