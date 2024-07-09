package Leetcode_July_Challenge;

public class july9 {
    
        //carry a variable which will indiacate when chef got free 
        // for a particula order when he got free minus when he ordered will give me the wait time for that oeder 
        //sum all the wait time and divide it by length will give the result
        public static double averageWaitingTime(int[][] customers) {
            double freeTime =customers[0][0];
            double totalWait =0;
            for(int i=0;i<customers.length;i++){
                if(freeTime<=customers[i][0]){
                    //if the chef is free before the new customer arrives 
                    totalWait= totalWait +customers[i][1];
                    freeTime= customers[i][1]+customers[i][0];
                }
                else{
                    freeTime += customers[i][1];//3+5+3
                    totalWait+=(freeTime -  customers[i][0]);//2+6+7
                }
            }
            System.out.println(totalWait);
            return (double)totalWait/customers.length;
        }
    
    public static void main(String[] args) {
        //customers = [[1,2],[2,5],[4,3]]
        int customers[][]={{1,2},{2,5},{4,3}};
        double averageWaitTime= averageWaitingTime(customers);
        System.out.println(averageWaitTime);
    }
}
