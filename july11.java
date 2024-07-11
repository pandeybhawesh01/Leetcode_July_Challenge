package Leetcode_July_Challenge;

import java.util.Stack;

public class july11 {
     public static String reverseParentheses(String s) {
        int n = s.length();
        Stack<Integer> openParenthesesIndices = new Stack<>();
        int[] pair = new int[n];

        // First pass: Pair up parentheses
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '(') {
                openParenthesesIndices.push(i);
            }
            if (s.charAt(i) == ')') {
                int j = openParenthesesIndices.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }

        // Second pass: Build the result string
        StringBuilder result = new StringBuilder();
        for (
            int currIndex = 0, direction = 1;
            currIndex < n;
            currIndex += direction
        ) {
            if (s.charAt(currIndex) == '(' || s.charAt(currIndex) == ')') {
                currIndex = pair[currIndex];
                direction = -direction;
            } else {
                result.append(s.charAt(currIndex));
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "sxmdll(q)eki(x)";
        String ans = reverseParentheses(s);
        System.out.println(ans);
    }
}
// wrong approach 
  // public static void revSubString(StringBuilder sb, int si, int ei) {
    //     while (si < ei) {
    //         char temp = sb.charAt(si);
    //         sb.setCharAt(si, sb.charAt(ei));
    //         sb.setCharAt(ei, temp);
    //         si++;
    //         ei--;
    //     }
    // }
    // public static String reverseParentheses(String s) {
    //     StringBuilder sb= new StringBuilder(s);
    //     int si=0;int ei=sb.length()-1;
    //     while (si<=ei) {
    //         if((sb.charAt(si) =='('||sb.charAt(si)==')')&&(sb.charAt(ei) =='('||sb.charAt(ei)==')')){
    //             revSubString(sb, si, ei);
    //             si++;
    //             ei--;
    //             System.out.println(sb);
    //         }
    //         else if((sb.charAt(si) !='('&&sb.charAt(si)!=')')) si++;
    //         else if((sb.charAt(ei) !='('&&sb.charAt(ei)!=')')) ei--;
    //     }
    //     String ans ="";
    //     for(int i=0;i<sb.length();i++){
    //         if(sb.charAt(i)!='('&&sb.charAt(i)!=')'){
    //             ans +=sb.charAt(i);
    //         }
    //     }
    //     return ans;
    // }