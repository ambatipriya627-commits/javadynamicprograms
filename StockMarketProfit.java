public class StockMarketProfit {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int p : prices) {
            if (p < minPrice) {
                minPrice = p;
            } else if (p - minPrice > maxProfit) {
                maxProfit = p - minPrice;
            }
        }

        System.out.println("Maximum profit: " + maxProfit);
    }
}
