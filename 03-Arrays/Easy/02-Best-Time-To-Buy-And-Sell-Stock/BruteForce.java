/**
 * BrtuteForce
 */
public class BruteForce {

    //method for get max profit
    public static int bestTimeToBuyAndSellStock(int[] prices){
        
        int maxProfit = 0;
        for(int i = 0; i<prices.length; i++){
            for(int j = i+1; j<prices.length; j++){
                if(prices[j]-prices[i]>maxProfit){
                    maxProfit = prices[j]-prices[i];
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {5, 4, 3, 2, 10, 1};
        int profit = bestTimeToBuyAndSellStock(prices);
        System.out.println(profit);
    }
}