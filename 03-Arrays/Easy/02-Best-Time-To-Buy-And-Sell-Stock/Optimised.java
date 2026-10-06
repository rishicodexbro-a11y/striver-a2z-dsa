/**
 * Optimised
 */
public class Optimised {
    public static int bestTimeToBuyAndSellStock(int[] prices){

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int j = 0;
        while (j < prices.length) {
            if(minPrice>prices[j])
                minPrice = prices[j];
            int currentProfit = prices[j]-minPrice;
            if(currentProfit>maxProfit)
                maxProfit = currentProfit;
            j++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = bestTimeToBuyAndSellStock(prices);
        System.out.println(maxProfit);
    }
}