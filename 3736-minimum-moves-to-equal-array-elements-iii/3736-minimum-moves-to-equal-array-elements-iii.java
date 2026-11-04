class Solution {
    public int minMoves(int[] nums) {
        int maxEle = Integer.MIN_VALUE, n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] > maxEle){
                maxEle = nums[i];
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            int diff = Math.abs(maxEle-nums[i]);
            count += diff;
            
        }
        return count;
    }
}