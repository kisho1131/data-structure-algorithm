class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int start = 0;
        int end = 0;
        long sum = 0;
        long max = -1L;
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        while(end  < nums.length) {
            freqMap.put(nums[end], freqMap.getOrDefault(nums[end], 0) + 1);
            sum += nums[end];
            if (end - start + 1 < k) {
                end++;
            }
            else if(end - start + 1 == k) {
                if(freqMap.size() == k) {
                    max = Math.max(max, sum);
                }
                sum-= nums[start];
                freqMap.put(nums[start], freqMap.get(nums[start]) - 1);
                if(freqMap.get(nums[start]) == 0)
                    freqMap.remove(nums[start]);
                start++;
                end++;
            }
        }
        return max > 0 ? max : 0;
    }
}