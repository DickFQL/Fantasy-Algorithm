package org.example.leetcode.leetcode;

public class _121_buy_stock {
    public static void main(String[] args) {
        int[] prices= new int[]{0, 1, 2, 3, 4, 5, 6};

        int profit=0;
        for(int i=0;i<prices.length;i++)
            for(int j=i+1;j<prices.length;j++)
                if((prices[j]-prices[i])>profit) profit=(prices[j]-prices[i]);
        System.out.println(profit);
    }


}
