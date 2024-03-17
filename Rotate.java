// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

// Example 1:
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]

// link : https://leetcode.com/problems/rotate-array/description/

class Rotate {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0)
            return;

        k = k % n;
        if (k == 0)
            return;

        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = nums[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
