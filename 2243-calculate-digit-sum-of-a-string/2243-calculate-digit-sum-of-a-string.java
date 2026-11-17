class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        sumDigits(sb, k);
        return sb.toString();
    }
    static void sumDigits(StringBuilder sb, int k){
        if(sb.length() <= k){
            return;
        }
        StringBuilder temp = new StringBuilder();
        int i = 0;
        while(i < sb.length()){
            String sub;
            if(sb.length() - i < k){
                sub = sb.substring(i, sb.length());
            }
            else{
                sub = sb.substring(i, i + k);
            }
            int sum = 0;
            for(int j=0; j<sub.length(); j++){
                sum += sub.charAt(j) - '0';
            }
            temp.append(sum);
            i += k;
        }
        sb.setLength(0);
        sb.append(temp);
        sumDigits(sb, k);
    }
}