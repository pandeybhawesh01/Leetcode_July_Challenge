package Leetcode_July_Challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class july2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> an = new ArrayList<>();
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                an.add(nums1[i]);
                i++;j++;k++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int[] arr = an.stream().mapToInt(p -> p).toArray();
        return arr;
    }
}
