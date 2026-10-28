class Solution {
    public int dominantIndex(int[] nums) {
        int index = -1;
        for(int i=0; i<nums.length; i++){
            int ele = nums[i], count = 0;
            for(int j=0; j<nums.length; j++){
                if(ele >= nums[j] * 2){
                    count++;
                }
                else if(i == j){
                    continue;
                }
                else{
                    break;
                }
            }
            if(count == nums.length - 1){
                index = i;
            }
        }
        return index;
    }
}