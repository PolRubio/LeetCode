public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices;

        prices = new int[]{7,1,5,3,6,4};
        System.out.println(solution.maxProfit(prices)); // 5

        prices = new int[]{7,6,4,3,1};
        System.out.println(solution.maxProfit(prices)); // 0

        prices = new int[]{2,4,1};
        System.out.println(solution.maxProfit(prices)); // 2

        prices = new int[]{3,2,6,5,0,3};
        System.out.println(solution.maxProfit(prices)); // 4
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int bestProfit=0, buyPrice=Integer.MAX_VALUE;

        for(int priceIndex = 0; priceIndex < prices.length; priceIndex++)
            if(prices[priceIndex] < buyPrice)
                buyPrice = prices[priceIndex];
            else if(bestProfit < prices[priceIndex]-buyPrice)
                bestProfit = prices[priceIndex]-buyPrice;

        return bestProfit;
    }
}