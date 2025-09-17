class Solution {
    public int minOperations(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return 0;
        int minOperation = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[i-1]) {
                int delta = Math.abs(nums[i] - nums[i-1]) + 1;
                minOperation += delta;
                nums[i] = nums[i-1] + 1;
            }
        }
        return minOperation;
    }
}