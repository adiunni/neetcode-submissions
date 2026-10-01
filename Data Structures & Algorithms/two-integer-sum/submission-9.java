class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> sumTrack = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            sumTrack.put(nums[i],i);
        }
        for(int i =0; i< nums.length;i++){
            int complement = target - nums[i];
            if(sumTrack.containsKey(complement) && i != sumTrack.get(complement)){
                res[0] = i;
                res[1] = sumTrack.get(complement);
                break;
            }
        }
        return res;
    }
}
