public class HouseRobber {

    public static int rob(int[] nums) {

        if (nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        int prev2 = 0;
        int prev1 = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int pick = nums[i] + prev2;
            int notPick = prev1;

            int current = Math.max(pick, notPick);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        System.out.println("Maximum money robbed: " + rob(nums));
    }
}