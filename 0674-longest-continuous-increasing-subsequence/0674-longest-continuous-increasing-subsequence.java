class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxCount = Integer.MIN_VALUE, n = nums.length;
        if(n == 1){
            return 1;
        }
        int count = 1;
        for(int i=0; i<n-1; i++){
            if(nums[i] < nums[i + 1]){
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else{
                count = 1;
            }
        }
        if(maxCount == Integer.MIN_VALUE){
            return 1;
        }
        return maxCount;
    }
}