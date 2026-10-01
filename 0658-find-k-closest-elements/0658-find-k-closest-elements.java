class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int p1 = 0, p2 = arr.length - 1;
        int n = arr.length;
        while(p2 - p1 + 1 > k){
            int leftDiff = Math.abs(arr[p1] - x);
            int rightDiff = Math.abs(arr[p2] - x);
            if(leftDiff > rightDiff){
                p1++;
            }
            else{
                p2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=p1; i<=p2; i++){
            list.add(arr[i]);
        }
        return list;
    }
}