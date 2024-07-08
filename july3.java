package Leetcode_July_Challenge;

import java.util.Arrays;

public class july3 {
    public int minDifference(int[] nums) {
        int n= nums.length;
        if(n<=4) return 0;
        Arrays.sort(nums);
        
        // 0 1 5 10 14   0 1 1 4 6 6 6
        // 14-10         6-4
        //0-1            4-0
        //5-1           6-1
        //10-5          6-1
        int min =Integer.MAX_VALUE;
        min = Math.min(min , nums[n-4]-nums[0]);
        System.out.println(min);
        min = Math.min(min , nums[n-1]-nums[3]);
        System.out.println(min);
        min = Math.min(min , nums[n-3]-nums[1]);
        System.out.println(min);
        min = Math.min(min , nums[n-2]-nums[2]);
        System.out.println(min);
        return min;
       
    }
}
