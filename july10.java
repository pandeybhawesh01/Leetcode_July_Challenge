package Leetcode_July_Challenge;

public class july10 {
    // iterate though the array add one whenever there is a movement to a child directory
    //subtract one if there is a movement to the parent directory 
    //the value will give the min number of operations
    public static int minOperations(String[] logs) {
        int subDir =0;
        for(int i=0;i<logs.length;i++){
         if(logs[i].charAt(1)=='.'){
             if(subDir<=0) continue;//to check if not already in main dir
             else
             subDir--;
         }
         else if(logs[i].charAt(0) == '.'){
             continue;
         }
         else{
             subDir++;
         }
        }
         if(subDir<=0) return 0;
         else return subDir;
     }
     public static void main(String[] args) {
        String logs[]= {"d1/","d2/","../","d21/","./"};
        int minOperations = minOperations(logs);
        System.out.println(minOperations);
     }
}
