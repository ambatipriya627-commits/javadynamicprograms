public class CompaignClicks {
    public static void main(String[] args) {
        int[] clicks = {120, 340, 560, 100, 50}; 
        int total = 0;
        int max = clicks[0];
        int maxIndex = 0;
        for (int i = 0; i < clicks.length; i++) {
            total += clicks[i];
            if (clicks[i] > max) {
                max = clicks[i];
                maxIndex = i;
            }
        }
        double avg = (double) total / clicks.length;

        System.out.println("Total clicks: " + total);
        System.out.println("Average clicks: " + avg);
        System.out.println("Best campaign index: " + maxIndex + " clicks: " + max);
    }
}
