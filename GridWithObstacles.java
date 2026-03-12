public class GridWithObstacles {
    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 0, 0},
            {0, 1, 0, 0}, 
            {0, 0, 1, 0},
            {0, 0, 0, 0}
        };
        
        System.out.println("Original Grid (0=Open, 1=Obstacle):");
        printGrid(grid);
        
        int paths = uniquePathsWithObstacles(grid);
        System.out.println("\nUnique Paths: " + paths);
        printDPTable(grid);
    }
    
    public static int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;    
        int n = grid[0].length; 
        
        if (grid[0][0] == 1 || grid[m-1][n-1] == 1) {
            return 0;
        }
        
        int[][] dp = new int[m][n];
    
        dp[0][0] = 1;
    
        for (int j = 1; j < n; j++) {
            if (grid[0][j] == 0) {
                dp[0][j] = dp[0][j-1];
            }
        }
        
        for (int i = 1; i < m; i++) {
            if (grid[i][0] == 0) {
                dp[i][0] = dp[i-1][0];
            }
        }
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] == 0) {  
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        
        return dp[m-1][n-1];
    }
    
    public static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 1) {
                    System.out.print("███ ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void printDPTable(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        
        if (grid[0][0] == 0) dp[0][0] = 1;
        for (int j = 1; j < n; j++) {
            if (grid[0][j] == 0) dp[0][j] = dp[0][j-1];
        }
        for (int i = 1; i < m; i++) {
            if (grid[i][0] == 0) dp[i][0] = dp[i-1][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] == 0) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        
        System.out.println("DP Table (Number of paths):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", dp[i][j]);
            }
            System.out.println();
        }
    }
}
