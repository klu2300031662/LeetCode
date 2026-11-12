class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen = 0, n = nums.length, count = 1;
        for(int i=0; i<n-1; i++){
            if(nums[i] < nums[i + 1]){
                count++;
                maxLen = Math.max(maxLen, count);
            }
            else{
                maxLen = Math.max(maxLen, count);
                count = 1;
            }
        }
        if(count > maxLen){
            maxLen = count;
        }
        count = 1;
        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i + 1]){
                count++;
                maxLen = Math.max(maxLen, count);
            }
            else{
                maxLen = Math.max(maxLen, count);
                count = 1;
            }
        }
        if(count > maxLen){
            maxLen = count;
        }
        return maxLen;
    }
}