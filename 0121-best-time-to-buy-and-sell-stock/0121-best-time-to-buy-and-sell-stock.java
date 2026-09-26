import java.util.*;
class Solution {
    public static int maxProfit(int[] prices) {
        int buyprice=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            int currentprofit=prices[i]-buyprice;

            if(currentprofit>maxprofit){
                maxprofit=currentprofit;
            }
            if(prices[i]<buyprice){
                buyprice=prices[i];
            }
        }

     return maxprofit;

    }
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}