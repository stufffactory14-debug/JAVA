package leetcode;

public class best_time_to_buy_122 {
    static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else if(prices[i]>min){
                profit+=prices[i]-min;
                min=prices[i];
            }

        }
    return profit;
    }
}
