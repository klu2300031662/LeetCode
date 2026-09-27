class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length; 
        for(int i=0; i<n; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        Arrays.sort(nums);
        int maxLen = Integer.MIN_VALUE;
        for(int i=0; i<n-1; i++){
            int diff = Math.abs(nums[i] - nums[i + 1]);
            if(diff == 1){
                maxLen = Math.max(maxLen, hm.get(nums[i]) + hm.get(nums[i + 1]));
            }
        }
        if(maxLen == Integer.MIN_VALUE){
            return 0;
        }
        return maxLen;
    }
}