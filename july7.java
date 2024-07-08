package Leetcode_July_Challenge;

public class july7 {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles+(numBottles-1)/(numExchange-1);
    }

    // class Solution {
//     public int numWaterBottles(int numBottles, int numExchange) {
//         int ans =numBottles;//15
//         int eb=numBottles;//15
//         while(eb>=numExchange){
//            ans+=eb/numExchange;
//            eb=eb/numExchange+ eb%numExchange;
//         }
//         return ans;
//     }
// }
}
