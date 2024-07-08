package Leetcode_July_Challenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class July8 {
    //my soln using duble ended queue 
     public int findTheWinner(int n, int k) {
        Deque<Integer> list = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int i=1;
        while (list.size() != 1) {

           for(i=1;i<k;i++){
            int top=list.pollFirst();
            list.offerLast(top);
           }
           i=0;
           list.remove();

        }

        return list.poll();
    }

    //optimised solution using recursion
    // public int findTheWinner(int n, int k) {
    //     if(n==1) return 1;
    //     return (findTheWinner(n-1,k)+k-1)%n+1;
    // }
}
