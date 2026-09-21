class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for(int i=2; i<=n; i++){
            str = count(str);
        }
        return str;
    }
    static String count(String str){
        if(str.length() == 1){
            return "11";
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else{
                sb.append(count);
                sb.append(str.charAt(i));
                count = 1;
            }
        }
        sb.append(count);
        sb.append(str.charAt(str.length() - 1));
        return String.valueOf(sb);
    }
}