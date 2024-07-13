package org.example.leetcode.HashMap;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class LeetCode242 {

    //空间换时间，数据计数
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] scnt = new int[26];
        for (char i : s.toCharArray()) {
            scnt[i-'a'] ++;
        }
        for (char i : t.toCharArray()) {
            scnt[i-'a'] --;
            if (scnt[i-'a']<0) return false;
        }
        return true;
    }
    //hashMap
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        for (char c : t.toCharArray()) {
            Integer orDefault = hashMap.getOrDefault(c, 0);
            if (orDefault.equals(0)) return false;
            else hashMap.put(c,orDefault-1);
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        int[] cnt = new int[10];
        char[] charArray = s.toCharArray();

        char[] charArray1 = t.toCharArray();
//        Arrays.sort(charArray);
//        Arrays.sort(charArray1);
//        Arrays.sort(charArray,1,3);
//        System.out.println(charArray);
//        System.out.println(charArray1);
        char i = (char)'a' + 1;
        System.out.println(i);

    }
}
