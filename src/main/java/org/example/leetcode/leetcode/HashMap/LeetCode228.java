package org.example.leetcode.leetcode.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode228 {

    public static List<String> summaryRanges_fail(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(nums[0],nums[0]);
        int pre=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] +1) {
                hashMap.put(nums[pre],nums[i]);
            }
            else {
                pre = i;
                hashMap.put(nums[pre],nums[pre]);
            }
        }

        Set<Integer> integers = hashMap.keySet();
        List<Integer> collect = integers.stream().sorted().collect(Collectors.toList());
        List<String> s = new ArrayList<>();
        for (Integer integer : collect) {
            if (integer.equals(hashMap.get(integer))){
                s.add(String.valueOf(integer));}
            else s.add(integer+"->"+hashMap.get(integer));
        }
        return s;
    }

    public static List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<String> s = new ArrayList<>();
        int pre=0,next=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] +1) {
                next++;
            }
            else {
                if (pre == next)
                    s.add(String.valueOf(nums[pre]));
                else s.add(nums[pre]+"->"+nums[next]);
                next = i;
                pre = next;
            }
        }
        if (pre == next)  s.add(String.valueOf(nums[pre]));
        else s.add(nums[pre]+"->"+nums[nums.length-1]);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
}
