class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) != '-'){
                sb.append(s.charAt(i));
            }
        }
        sb.reverse();
        s = sb.toString();
        sb.setLength(0);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(i != 0 && i % k == 0){
                sb.append('-');
            }
            if(ch >= 'a' && ch <= 'z'){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(ch);
            }
        }
        sb.reverse();
        return sb.toString();
    }
}