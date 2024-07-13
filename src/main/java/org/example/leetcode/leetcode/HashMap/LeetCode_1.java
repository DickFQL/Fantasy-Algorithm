package org.example.leetcode.leetcode.HashMap;

import java.util.HashMap;

public class LeetCode_1 {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                return new int[]{hashMap.get(nums[i]), i};
            }
            else {
                hashMap.put(target - nums[i], i);
            }

        }
        return new int[0];
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 2);
        if (hashMap.containsKey(1)) System.out.println("有1键");
        else System.out.println("没有1键");
        if (hashMap.containsKey(2)) System.out.println("有2键");
        else System.out.println("没有2键");
        if (hashMap.containsValue(1)) System.out.println("有1值");
        else System.out.println("没有1值");
        if (hashMap.containsValue(2)) System.out.println("有2值");
        else System.out.println("没有3键");
//        hashMap.clear();
//        boolean b = hashMap.containsKey(1);
//        if (b) System.out.println("有1键");
//        else System.out.println("没有1键");
        Integer merge = hashMap.merge(1, 4, (oldValue, newValue) -> oldValue + newValue);
        System.out.println(merge);
        if (hashMap.isEmpty()) {
            System.out.println("是空");
        } else {
            System.out.println("不是空");
        }

        hashMap.remove(1);

        System.out.println(hashMap.getOrDefault(1,3));
//        twoSum(new int[]{2,7,11,15},9);
    }
}
