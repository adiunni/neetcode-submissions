class Solution {
    public boolean hasDuplicate(int[] nums) {
        int[] stack = new int[nums.length];
        int sp = 0;
        Arrays.sort(nums);
        for(int i =0 ;i<nums.length;i++){
            if(i == 0){
                stack[sp] = nums[i];
                continue;
            } else if (stack[sp] == nums[i]){
                return true;
            } else {
                sp++;
                stack[sp] = nums[i];
            }
        }
        return false;
    }
}