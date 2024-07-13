package org.example.leetcode.leetcode;

public class _125_验证回文串优化 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if (ispalindrome(s)) System.out.println("true");
        else System.out.println("false");
    }
    public static boolean ispalindrome(String s){
        String s1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuffer sgood_rev = new StringBuffer(s1).reverse();
        return s1.toString().equals(sgood_rev.toString());

    }

}
