package org.example.leetcode.leetcode.Bit;

public class LeetCode201 {

    public int rangeBitwiseAnd_old(int left, int right) {
        if (right<left)            return 0;

        for (int i = left; i <= right; i++) {
            left &= i;
        }
        return left;
    }
    public int rangeBitwiseAnd(int left, int right) {
        if (right<left)            return 0;
        int cnt = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        left<<=cnt;
        return left;
    }
    public static int rangeBitwiseAnd2(int left, int right) {
        if (right<left)  return 0;
        while (left <right) {
            right &= right-1;
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd2(9,12));
    }
}
