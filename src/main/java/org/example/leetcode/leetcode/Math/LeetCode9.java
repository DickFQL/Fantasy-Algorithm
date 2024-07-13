package org.example.leetcode.leetcode.Math;

public class LeetCode9 {

    public boolean isPalindrome2(int x) {
        return new StringBuilder(String.valueOf(x)).toString().equals(new StringBuilder(String.valueOf(x)).reverse().toString())  ;
    }
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int cnt=0;
        //获得倒序的数
//        while(x !=0) {
//            cnt = (x%10)+cnt*10;
//            x/=10;
//        }
        while(x > cnt) {
            cnt = (x%10)+cnt*10;
            x/=10;
        }
        return cnt==x || cnt/10==x;
    }

}
