public class NetflixWatchStreaks{
    public static void main(String[] args) {
        int[] days = {1, 1, 0, 1, 1, 1, 0, 1};

        int currentStreak = 0;
        int maxStreak = 0;

        for (int d : days) {
            if (d == 1) {
                currentStreak++;
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        System.out.println("Longest watch streak: " + maxStreak + " days");
    }
}
