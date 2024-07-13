package org.example.leetcode.sort;

public class FastSort {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickselect(nums,0,n-1,n - k);
    }

    private static int quickselect(int[] nums, int l, int r, int k) {
        if (l == r){
            return nums[l];
        }
        int i = l-1,j=r+1;
        int pivot = nums[l];
        while (i < j){
            do i++; while (nums[i] < pivot);
            do j--; while (nums[j] > pivot);
            if (i < j){
                swap(nums, i,j);
            }
        }
        if (j == k){
            return nums[j];
        }
        if (i > k) return quickselect(nums, l, i-1, k);
        else return quickselect(nums, i+1, r, k);
    }
    private static void quickselect2(int[] nums, int l, int r) {
        if (l >= r){
            return ;
        }
        int i = l-1,j=r+1;
        int pivot = nums[l];
        while (i < j){
            do i++; while (nums[i] < pivot);
            do j--; while (nums[j] > pivot);
            if (i < j){
                swap(nums, i,j);
            }
        }
        quickselect2(nums, l, i-1);
        quickselect2(nums, i+1, r);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5,6,4};
        int k=1;
//        System.out.println(findKthLargest(nums,0));
        quickselect2(nums,0, nums.length-1);
        System.out.println(nums);
    }

}
