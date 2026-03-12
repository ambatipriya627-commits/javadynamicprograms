public class AdRevenueOpt {
    public static void main(String[] args) {
        int[] clicks = {100, 300, 150, 400, 200}; // clicks per ad position
        int[] ctr = {2, 5, 3, 8, 4};              // click-through rates
        int maxRevenue = 0;
        int bestPosition = 0;
        for (int i = 0; i < clicks.length; i++) {
            int revenue = clicks[i] * ctr[i];
            if (revenue > maxRevenue) {
                maxRevenue = revenue;
                bestPosition = i;
            }
        }
        System.out.println("Best ad position: " + bestPosition);
        System.out.println("Max revenue: Rs." + maxRevenue);
    }
}
