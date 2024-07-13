package org.example.leetcode.leetcode;

public class _125_验证回文串 {


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if (ispalindrome(s)) System.out.println("true");
        else System.out.println("false");
    }
    public static boolean ispalindrome(String s){
        String s1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = s1.length()-1;
        while(left < right){
            if (s1.charAt(left++) != s1.charAt(right--)) return false;
        }
        return true;
    }

}
