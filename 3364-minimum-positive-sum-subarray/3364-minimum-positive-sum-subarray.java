class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minValue = Integer.MAX_VALUE;
        for(int k=l; k<=r; k++){
            int sum = 0;
            for(int i=0; i<k; i++){
                sum += nums.get(i);
            }
            if(sum > 0){
                minValue = Math.min(sum, minValue);
            }
            for(int i=k; i<n; i++){
                sum += nums.get(i);
                sum -= nums.get(i - k);
                if(sum > 0){
                    minValue = Math.min(sum, minValue);
                }
            }
        }
        if(minValue == Integer.MAX_VALUE){
            return -1;
        }
        return minValue;
    }
}