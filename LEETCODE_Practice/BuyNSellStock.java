package LEETCODE_Practice;

public class BuyNSellStock {
  public static int buyNSellStocks(int prices[]) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i = 0; i < prices.length; i++){
      if(buyPrice < prices[i]){
        int profit = prices[i] - buyPrice; // todays profit
        maxProfit = Math.max(maxProfit, profit); // overall profit
      } else {
        buyPrice = prices[i]; // update buy price
      }
    }
    return maxProfit;
  }
  public static void main(String[] args) {
    int prices[] = {7, 1, 5, 3, 6, 4};
    System.out.println("Maximum profit: " + buyNSellStocks(prices));
  }
}
