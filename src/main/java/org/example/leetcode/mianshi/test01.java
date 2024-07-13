package org.example.leetcode.mianshi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test01 {
// 已知数组 A, B, 如果 A 中元素在 B 数组存在，打印出这个元素的下标，B 数组是不重复的.
// Input: [5, 3, 1, 5, 4] [5, 3]
// Output: [0, 1, 3]
    public static void print(int[] a, int[] b){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> out = new ArrayList<>();
//        int index =0;
        for (int i = 0; i < b.length; i++) {
            if (!hashMap.containsKey(b[i]))     hashMap.put(b[i],1);
        }
        for (int i = 0; i < a.length; i++) {
            if(hashMap.containsKey(a[i])) {
                out.add(i);
            }
        }
        System.out.println(out);

    }
    public static void main(String[] args) {
        int[] a = new int[]{5, 3, 1, 5, 4};
        int[] b = new int[]{5, 3};
        print(a,b);
    }
}
