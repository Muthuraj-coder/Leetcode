class Solution {
    public int minimumSumSubarray(List<Integer> nums, int left, int right) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n && j < i + right; j++) {
                sum += nums.get(j);

                int length = j - i + 1;

                if (length >= left && sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}