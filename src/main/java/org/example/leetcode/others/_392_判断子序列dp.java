package org.example.leetcode.others;

public class _392_判断子序列dp {

    public static boolean isSubsequence(String s, String t) {
        int n=s.length(),m=t.length();

        int[][] f = new int[m+1][26];
        for (int i = 0; i < 26; i++) {
            f[m][i] = m;
        }
        for (int i = m-1; i >=0; i--) {
            for (int j = 25; j >=0 ; j--) {
                if ((t.charAt(i)-'a')!=j ) f[i][j]=f[i+1][j];
                else f[i][j] = i;
            }
        }
        int index=0;
        for (int i = 0; i < n; i++) {
            if (f[index][s.charAt(i)-'a'] == m) return false;
            index = f[index][s.charAt(i)-'a'] + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="abc" , t = "ahbgdc";
        if (isSubsequence(s,t)) System.out.println("是的");
        else System.out.println("不是的");
    }

}
