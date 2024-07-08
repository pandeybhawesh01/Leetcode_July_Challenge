package Leetcode_July_Challenge;

public class july1 {
    public boolean threeConsecutiveOdds(int[] arr) {
        int r=0;
        while(r<arr.length){
         if(arr[r]%2!=0 && r<arr.length-2){
             if(arr[r+1]%2!=0 && arr[r+2]%2!=0){
                 return true;
             }
         }
         r++;
        } 
        return false;
     }
}
