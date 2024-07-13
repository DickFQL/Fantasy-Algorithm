package org.example.leetcode.HashMap;

import java.util.HashMap;

public class LeetCode219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i]) && Math.abs(hashMap.get(nums[i])-i)<=k) return true;
            hashMap.put(nums[i],i);
        }
        return  false;
    }

    public static void main(String[] args) {

    }
}
