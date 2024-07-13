package org.example.leetcode.leetcode.HashMap;

public class LeetCode383_opt1 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] cnt= new int[26];

        for (char ch : magazine.toCharArray()) {
            cnt[ch - 'a'] ++;
        }
        for (char ch : ransomNote.toCharArray()) {
            cnt[ch - 'a']--;
            if (cnt[ch - 'a'] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a = 16;
        int i = a >> 1;
        System.out.println(i);
    }
}
