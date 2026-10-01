class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    private void mergeSort(int[] arr, int l, int r){
        if(l >= r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    private void merge(int[] nums, int start, int mid, int end){
        List<Integer> temp = new ArrayList<>();
        int i = start, j = mid+1;
        while(i<=mid && j <= end){
            if(nums[i] <= nums[j]){
                temp.add(nums[i]);
                i++;
            } else {
                temp.add(nums[j]);
                j++;
            }
        }
        while (i<=mid){
            temp.add(nums[i]);
            i++;
        }
        while(j<=end){
            temp.add(nums[j]);
            j++;
        }
        for(i=start;i<=end;i++){
            nums[i] = temp.get(i-start);
        }
    }
}