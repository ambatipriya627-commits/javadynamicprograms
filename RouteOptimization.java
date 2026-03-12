public class RouteOptimization {
    static int[][] dist = {
            {0, 10, 15, 20},  
            {10, 0, 35, 25},  
            {15, 35, 0, 30},  
            {20, 25, 30, 0}   
    };
    static int minCost = Integer.MAX_VALUE;
    static int[] bestPath;

    static void permute(int[] arr, int l, int r) {
        if (l == r) {
            int cost = routeCost(arr);
            if (cost < minCost) {
                minCost = cost;
                bestPath = arr.clone();
            }
            return;
        }

        for (int i = l; i <= r; i++) {
            swap(arr, l, i);
            permute(arr, l + 1, r);
            swap(arr, l, i);
        }
    }
    static int routeCost(int[] path) {
        int cost = 0;
        int start = 0; 

        int current = start;
        for (int p : path) {
            cost += dist[current][p];
            current = p;
        }
        cost += dist[current][start]; 
        return cost;
    }
    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {
        int[] locations = {1, 2, 3};
        permute(locations, 0, locations.length - 1);

        System.out.print("Best path: 0 -> ");
        for (int p : bestPath) {
            System.out.print(p + " -> ");
        }
        System.out.println("0");
        System.out.println("Minimum cost: " + minCost);
    }
}
