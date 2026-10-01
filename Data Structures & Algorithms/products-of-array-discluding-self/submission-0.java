class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        int[] res = new int[nums.length];
        int len = nums.length;
        int counter = 0;

        while (counter < len){
            int mul = 1;
            for(int i = 0; i< len;i++){
                if(i == counter) continue;
                else {
                    mul *= nums[i];
                }
            }
            res[counter] = mul;
            counter +=1;
        }

        return res;
    }
}  
