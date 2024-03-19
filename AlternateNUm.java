// You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

// You should return the array of nums such that the the array follows the given conditions:

// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.
// Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

// Example 1:
// Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]

// link : https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

public class AlternateNUm {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int even = 0, odd = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                temp[even] = nums[i];
                even += 2;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                temp[odd] = nums[i];
                odd += 2;
            }
        }

        return temp;
    }

}
