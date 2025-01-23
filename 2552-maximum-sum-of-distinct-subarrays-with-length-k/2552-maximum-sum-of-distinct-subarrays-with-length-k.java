class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
            long max = -1L;
            long sum = 0;
            int start = 0;
            int end = 0;
            Map<Integer, Integer> freqMap = new HashMap<>();
            while (end < nums.length) {
            sum += nums[end];
            freqMap.put(nums[end], freqMap.getOrDefault(nums[end], 0) + 1);
            if (end - start + 1 < k) {
                end++;
            }
                else if (end - start + 1 == k) {
                    if (freqMap.size() == k) {
                    max = Math.max(max, sum);
                    }
                    sum -= nums[start];
                    freqMap.put(nums[start], freqMap.get(nums[start]) - 1);
                    if (freqMap.get(nums[start]) == 0) {
                    freqMap.remove(nums[start]);
                    }
                    start ++;
                    end ++;
                }
            }
            return max > 0 ? max : 0;
    }
}