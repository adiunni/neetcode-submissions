class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> dupElems = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(dupElems.containsKey(nums[i])) {
                return true;
            } else {
                dupElems.put(nums[i],1);
            }
        }
        return false;
    }
}