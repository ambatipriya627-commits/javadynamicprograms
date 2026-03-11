public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Ways to climb: " + climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n <= 2)
            return n;

        int first = 1, second = 2;

        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }
} 