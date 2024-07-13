package org.example.leetcode.leetcode.Bit;


// 191. 位1的个数
public class LeetCode191 {

    public int hammingWeight(int n) {
        int cnt =0;
        while(n!=0){
            if((n&1)==1) {
                cnt++;
            }
            n>>>=1;
        }
        return cnt;
    }

    public static void main(String[] args) {

    }

}
