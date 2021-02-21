package Array;

public class LC53 {

    public int maxSubArray(int[] nums) {


        if (nums.length == 0) return 0;
        else if (nums.length == 1) return nums[0];

        int[] dp = new int[nums.length+1];

        dp[0] = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < dp.length; i++) {
            if (nums[i] <= dp[i - 1] + nums[i]) dp[i] = dp[i - 1] + nums[i];
            else dp[i] = nums[i];

            if (dp[i] >= max) max = dp[i];

        }
        return max;

    }
}


/*

Time Complexity : O(n)
Space Complexity : O(n)

 */