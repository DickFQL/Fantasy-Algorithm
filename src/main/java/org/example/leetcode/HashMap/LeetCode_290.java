package org.example.leetcode.HashMap;

import java.util.HashMap;

public class LeetCode_290 {

    //单词规律
    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        if (pattern.length() != split.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String c2 = split[i];
//            if (map.get(c) == null) {
//                map.put(c, split[i]);
//            }
//            else if (!map.get(c).equals(split[i])) {
//                return false;
//            }
//            if (map2.get(c2) == null) {
//                map2.put(c2, c);
//            }
//            else if (!map2.get(c2).equals(c)) {
//                return false;
//            }
            if (map.get(c) != null && !map.get(c).equals(split[i]) || map2.get(c2) != null && !map2.get(c2).equals(c)){
                return false;
            }
            map.put(c, c2);
            map2.put(c2, c);
        }
        return true;
    }
    public static void main(String[] args) {
        LeetCode_290 leetcode = new LeetCode_290();
        HashMap<Character, String> map = new HashMap<>();
        map.put('a', "cat");
        boolean b = map.containsKey('a');
        if (b) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

}
