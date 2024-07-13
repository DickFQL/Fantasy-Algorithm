package org.example.leetcode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_205 {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))==null) {
                map.put(s.charAt(i), t.charAt(i));
            } else if (map.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (map1.get(t.charAt(i))==null) {
                map1.put(t.charAt(i), s.charAt(i));
            } else if (map1.get(t.charAt(i))!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
    // 优化
    public static boolean isIsomorphicOpt(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (map.containsKey(cs) && map.get(cs)!=ct || (map1.containsKey(ct) && map1.get(ct)!=cs)) {
                return false;
            }
            map.put(cs, ct);
            map1.put(ct, cs);
        }
        return true;
    }

    public static void main(String[] args) {
        isIsomorphic("badc","baba");
    }

}
