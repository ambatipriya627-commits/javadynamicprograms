public class InternetDataUsage {
    public static void main(String[] args) {
        double[] dailyUsageGB = {1.2, 0.8, 2.5, 3.0, 0.5}; 
        double limitGB = 10.0;
        double total = 0;
        for (int i = 0; i < dailyUsageGB.length; i++) {
            total += dailyUsageGB[i];
            System.out.println("Day " + (i + 1) + ": " + dailyUsageGB[i] + " GB, Total: " + total + " GB");
            if (total > limitGB) {
                System.out.println("Alert: Data limit exceeded on day " + (i + 1));
                break;
            }
        }
    }
}
