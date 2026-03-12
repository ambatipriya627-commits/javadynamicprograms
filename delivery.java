import java.util.*;

public class delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] distances = {
            {0, 5, 12, 8, 15},   
            {6, 0, 10, 14, 7},   
            {11, 9, 0, 6, 13},    
            {7, 13, 5, 0, 9}     
        };
        
        int hub = 0; 
        System.out.println("DELIVERY PARTNERS RETURNING HOME");
        System.out.println("Current time: 8:30 PM");
        System.out.println("==================");
        for (int partner = 0; partner < distances.length; partner++) {
            int minDistance = Integer.MAX_VALUE;
            int bestHome = -1;
            
            for (int home = 1; home < distances[partner].length; home++) {
                if (distances[partner][home] < minDistance) {
                    minDistance = distances[partner][home];
                    bestHome = home;
                }
            }
            int travelTimeMin = (minDistance * 60) / 40;
            String eta = String.format("ETA: 20:%02d", 30 + travelTimeMin);
            System.out.println("\nPartner " + (partner + 1) + ":");
            System.out.println("Home -> Area " + bestHome);
            System.out.println("Distance: " + minDistance + " km");
            System.out.println(eta);
        }
        System.out.println("\n=== SUMMARY ===");
        System.out.println("All partners reach home by: 21:30");
        System.out.println("Total distance traveled: " + calculateTotalDistance(distances));
        System.out.println("Fuel cost approx: Rs. " + (calculateTotalDistance(distances) * 8 / 100));
        sc.close();
    }
    public static int calculateTotalDistance(int[][] distances) {
        int total = 0;
        for (int[] partner : distances) {
            int minDist = Integer.MAX_VALUE;
            for (int home = 1; home < partner.length; home++) {
                if (partner[home] < minDist) {
                    minDist = partner[home];
                }
            }
            total += minDist;
        }
        return total;
    }
}
