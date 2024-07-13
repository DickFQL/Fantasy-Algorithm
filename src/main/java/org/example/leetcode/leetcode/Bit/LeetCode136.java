package org.example.leetcode.leetcode.Bit;

public class LeetCode136 {

    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0] = nums[i] ^ nums[0];
        }
        return nums[0];
    }

    public static void main(String[] args) {

    }

}
