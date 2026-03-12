import java.util.Scanner;

public class hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] hourlyActivity = {5, 3, 2, 1, 2, 10, 25, 45, 60, 80, 95, 100, 
                               90, 85, 75, 70, 65, 55, 40, 30, 20, 15, 12, 8};
        
        int maxActivity = 0;
        int busyHour = 0;
        
        System.out.println("Hourly Activity Analysis (24-hour format):");
        System.out.println("Hour\tActivity");
        System.out.println("----\t--------");
        
        for (int hour = 0; hour < 24; hour++) {
            System.out.println(hour + ":00\t" + hourlyActivity[hour]);
            
            if (hourlyActivity[hour] > maxActivity) {
                maxActivity = hourlyActivity[hour];
                busyHour = hour;
            }
        }
        
        System.out.println("\n*** RESULTS ***");
        System.out.println("Busiest hour: " + busyHour + ":00 - " + (busyHour + 1) + ":00");
        System.out.println("Peak activity: " + maxActivity + " events");
        System.out.println("Quietest hour: " + findQuietestHour(hourlyActivity) + ":00");
        
        System.out.print("\nEnter your 24 hourly data (space separated): ");
        String input = sc.nextLine();
        if (!input.trim().isEmpty()) {
            analyzeCustomData(input);
        }
        
        sc.close();
    }
    
    public static void analyzeCustomData(String input) {
        String[] parts = input.trim().split("\\s+");
        int[] data = new int[Math.min(parts.length, 24)];
        
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(parts[i]);
        }
        
        int max = 0, busyHour = 0;
        for (int hour = 0; hour < data.length; hour++) {
            if (data[hour] > max) {
                max = data[hour];
                busyHour = hour;
            }
        }
        System.out.println("Your busiest hour: " + busyHour + ":00 (" + max + " events)");
    }
    public static int findQuietestHour(int[] data) {
        int min = data[0], quietHour = 0;
        for (int hour = 1; hour < 24; hour++) {
            if (data[hour] < min) {
                min = data[hour];
                quietHour = hour;
            }
        }
        return quietHour;
    }
}
