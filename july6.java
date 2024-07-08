package Leetcode_July_Challenge;

public class july6 {
    public int passThePillow(int n, int time) {
        if((time/(n-1)) %2==0) return (time%(n-1))+1;
        else return n-(time%(n-1));
     }

    //  public int passThePillow(int n, int time) {
    //     int fr = time/(n-1);
    //     int et = time%(n-1);
 
    //     if(fr %2==0) return et+1;
    //     else return n-et;
    //  }
}
