public class UniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 3; 
        
        System.out.println("Unique paths from (0,0) to (" + (m-1) + "," + (n-1) + "): " + uniquePaths(m, n));
        System.out.println("Unique paths 7x3 grid: " + uniquePaths(7, 3));
        
        printGridPaths(3, 3);
    }
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for (int i = 0; i < m; i++) dp[i][n-1] = 1;
        for (int j = 0; j < n; j++) dp[m-1][j] = 1;
    
        for (int i = m-2; i >= 0; i--) {
            for (int j = n-2; j >= 0; j--) {
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }
        
        return dp[0][0];
    }
    
   
    public static int uniquePathsOptimized(int m, int n) {
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) dp[i] = 1;
        
        for (int i = 1; i < m; i++) {
            for (int j = n-2; j >= 0; j--) {
                dp[j] = dp[j] + dp[j+1];
            }
        }
        
        return dp[0];
    }
    
    public static void printGridPaths(int m, int n) {
        int[][] grid = new int[m][n];
        
        for (int i = 0; i < m; i++) grid[i][n-1] = 1;
        for (int j = 0; j < n; j++) grid[m-1][j] = 1;
        
        for (int i = m-2; i >= 0; i--) {
            for (int j = n-2; j >= 0; j--) {
                grid[i][j] = grid[i+1][j] + grid[i][j+1];
            }
        }
        
        System.out.println("\nDP Table (" + m + "x" + n + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", grid[i][j]);
            }
            System.out.println();
        }
    }
}
