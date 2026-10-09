class Solution {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                absentCount++;
            }
        }
        int lCount = Integer.MIN_VALUE, count = 1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == 'L' && s.charAt(i + 1) == 'L'){
                count++;
                lCount = Math.max(count, lCount);
            }
            else{
                count = 1;
            }
        }
        if(absentCount < 2 && lCount < 3){
            return true;
        }
        return false;
    }
}