package org.example.leetcode.Bit;

public class LeetCode190 {

    // 190. Reverse Bits
    public static int reverseBits(int n) {
        int a = 0;
        for (int i = 0; i < 32; i++) {
            a |= (n&1)<<(31-i);
            n=n>>1;
        }
        return a;
    }


    public static void main(String[] args) {
        int n = 13;
        int a = 11;
        int b = 0b10100000100000000000000000000000;
        System.out.println(b);
//        System.out.println(reverseBits(b));
        for (int i = 0; i < 32; i++) {
//            b>>=1;
            b=b<<1;
            System.out.println(b);
        }
    }

}
