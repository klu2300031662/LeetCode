class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int count = 0, ans = 0;
        int i = 0;
        while(i < s.length()){
            int sum = 0;
            while(i < s.length() && sum+widths[s.charAt(i) - 'a'] <= 100){
                sum += widths[s.charAt(i++) - 'a'];
            }
            ans = sum;
            count++;
        }
        return new int[]{count, ans};
    }
}