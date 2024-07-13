package org.example.leetcode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class LeetCode383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> hashMap = new HashMap<Character,Integer>();
        for(int i=0;i<magazine.length();i++) {
            Character ch = magazine.charAt(i);
            hashMap.merge(ch, 1, Integer::sum);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (hashMap.get(ransomNote.charAt(i))== null ||hashMap.get(ransomNote.charAt(i)) == 0) return false;
            else hashMap.put(ransomNote.charAt(i),hashMap.get(ransomNote.charAt(i))-1);
        }
        return true;
    }


    public static void main(String[] args) {
        Map<Character, Integer> hashMap = new HashMap<Character,Integer>();
        hashMap.put('a',1);
        Integer a = hashMap.get('a');
        Integer b = hashMap.get('b');
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        String ransomNote = "a";
        String magazine = "b";
        if (canConstruct( ransomNote,  magazine)) System.out.println("是的");
        else System.out.println("不是的");
    }
}
