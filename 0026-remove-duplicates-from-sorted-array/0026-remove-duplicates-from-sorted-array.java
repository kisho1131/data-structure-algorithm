class Solution {
    public int removeDuplicates(int[] nums) {
         List<Integer> rs = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toList());
        LinkedHashSet<Integer> result = new LinkedHashSet<>(rs);
        List<Integer> res = new ArrayList<>(result);
        for(int i = 0; i < result.size(); i++) {
            nums[i] = res.get(i);
        }
        return result.size();
    }
}