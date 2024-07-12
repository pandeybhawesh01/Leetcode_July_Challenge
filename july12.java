package Leetcode_July_Challenge;

import java.util.Stack;

public class july12 {
    public static int maximumGain(String s, int x, int y) {
        int totalScore = 0;
        String highPriorityPair = x > y ? "ab" : "ba";
        String lowPriorityPair = highPriorityPair.equals("ab") ? "ba" : "ab";

        String stringAfterFirstPass = removeSubstring(s, highPriorityPair);
        int removedPairsCount =
            (s.length() - stringAfterFirstPass.length()) / 2;
        totalScore += removedPairsCount * Math.max(x, y);

        String stringAfterSecondPass = removeSubstring(
            stringAfterFirstPass,
            lowPriorityPair
        );
        removedPairsCount = (stringAfterFirstPass.length() -
            stringAfterSecondPass.length()) /
        2;

        totalScore += removedPairsCount * Math.min(x, y);

        return totalScore;
    }

    private static String removeSubstring(String input, String targetPair) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (
                currentChar == targetPair.charAt(1) &&
                !charStack.isEmpty() &&
                charStack.peek() == targetPair.charAt(0)
            ) {
                charStack.pop();
            } else {
                charStack.push(currentChar);
            }
        }
        StringBuilder remainingChars = new StringBuilder();
        while (!charStack.isEmpty()) {
            remainingChars.append(charStack.pop());
        }
        return remainingChars.reverse().toString();
    }
    public static void main(String[] args) {
        String s ="aabbaaxybbaabb";
        int x=4;
        int y=5;
        int ans = maximumGain(s, x, y);
        System.out.println(ans);
    }
}



// // TLE Approach
// int countx=0;
// int county=0;
// String snew = s;
// if(y>x){
//     while (true) {
//         int len1= snew.length();
//         snew = snew.replace("ba", "");
//         int len2= snew.length();
//         if(len1==len2) break;
//     }
//     county= (s.length()-snew.length())/2;
//     s=snew;
//     while (true) {
//         int len1= snew.length();
//         snew = snew.replace("ab", "");
//         int len2= snew.length();
//         if(len1==len2) break;
//     }
//     countx= (s.length()-snew.length())/2;
// }
// else{
//     while (true) {
//         int len1= snew.length();
//         snew = snew.replace("ab", "");
//         int len2= snew.length();
//         if(len1==len2) break;
//     }
//     countx= (s.length()-snew.length())/2;
//     s=snew;
//     while (true) {
//         int len1= snew.length();
//         snew = snew.replace("ba", "");
//         int len2= snew.length();
//         if(len1==len2) break;
//     }
//     county= (s.length()-snew.length())/2; 
// }
// int ans = (countx*x)+(county*y);
// return ans;
