package org.example.leetcode.others;

public class _392_判断子序列 {

    public static boolean isSubsequence(String s, String t) {
        int j=0;
        int slen = s.length();
        for (int i = 0; i < t.length(); i++) {
            if (j==slen) break;
            if (s.charAt(j) ==t.charAt(i)) j++;
        }
        if (j==slen) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        if (isSubsequence(s,t)) System.out.println("是子序列");
        else System.out.println("不是子序列");
    }

}
