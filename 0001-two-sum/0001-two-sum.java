class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = mp.get(target - nums[i]);
            if(value != null ) {
                return new int[]{value, i};
            } else 
                mp.put(nums[i], i);
        }
        return new int[]{};
    }
}