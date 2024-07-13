package org.example.leetcode.leetcode;

import java.util.HashMap;

public class _131_Roman_Exchange {

    public static int romansum(String s){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("I",1);
        hashMap.put("V",5);
        hashMap.put("X",10);
        hashMap.put("L",50);
        hashMap.put("C",100);
        hashMap.put("D",500);
        hashMap.put("M",1000);
        int sum=0;
        if (s.length()==1) return hashMap.get(s);
        for (int i = 0; i < s.length()-1; i++) {
            if (hashMap.get(s.substring(i,i+1)) < hashMap.get(s.substring(i+1,i+2))){
                sum -= hashMap.get(s.substring(i,i+1)) ;

            }
            else {
                sum +=  hashMap.get(s.substring(i,i+1));
            }
        }
        sum += hashMap.get(s.substring(s.length()-1,s.length()));
        return sum;
    }


    public static void main(String[] args) {

        String string = "MCMXCIV";
        System.out.println(romansum(string));


    }
}
