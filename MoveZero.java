// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// link :import java.util.Arrays;

class MoveZero {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                int j = i;
                while (j > 0 && nums[j - 1] == 0) {
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    j--;
                }
            }
        }
    }
}