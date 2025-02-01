class Solution {
    public int distinctAverages(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        Arrays.sort(nums);
        Set<Double> result = new HashSet<>();
        while (start <= end) {
            int min = nums[start];
            int max = nums[end];
            result.add(Double.valueOf((min+max) / 2.0 ));
            end--;
            start++;
        }
        return result.size();
    }
}