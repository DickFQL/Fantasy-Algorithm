package org.example.leetcode.leetcode;

public class _131_optimization {
    public static int getnum(char c){
        switch (c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default: return 0;
        }
    }
    public static int romansum(String s){
        int sum =0;
        int pre = getnum(s.charAt(0));
        if (s.length()==1) return pre;
        for (int i = 1; i < s.length(); i++) {
            int num = getnum(s.charAt(i));

            if (pre < num){
                sum -= pre;
            }
            else {
                sum += pre;
            }
            pre = num;
        }
        sum += pre;
        return sum;
    }

    public static void main(String[] args) {

        String string = "MCMXCIV";
        System.out.println(romansum(string));


    }
}
//使用hashmap的速度比使用Switch的慢4ms
//使用substring的速度比使用charAt的速度慢4ms