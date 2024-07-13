package org.example.leetcode.HashMap;

public class LeetCode202 {

    public static int cntn(int n){
        int i =0;
        while (n!=0){
            i+= (n%10)*(n%10);
            n/=10;
        }
        return i;
    }
    public boolean isHappy(int n) {
        int temp = n;
        int temp2=0;
        while(true){
            n = cntn(n);
            temp = cntn(cntn(temp));
            if (temp ==1 || n == 1) return true;
            if (temp == n) return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(cntn(113));
    }
}
