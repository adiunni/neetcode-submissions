class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return null;
        List<int[]> arr = new ArrayList<>();

        Map<Integer, Integer> count = new HashMap<>();
        for (int num: nums){
            count.put(num, count.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a,b) -> b[0] - a[0]);

        int[] res = new int[k];

        for(int i = 0; i < k; i++){
            res[i] = arr.get(i)[1];
        }

        return res;
    }
}
