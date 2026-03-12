public class ServerCost {
    public static void main(String[] args) {
        int[] serverLoads = {10, 30, 20, 40, 15}; 
        int maxCapacity = 25;
        int totalServers = 0;
        for (int load : serverLoads) {
            if (load > maxCapacity) {
                totalServers += 2; 
            } else {
                totalServers++; 
            }
        }
        System.out.println("Minimum servers needed: " + totalServers);
    }
}
