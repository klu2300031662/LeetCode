class Solution {
    public boolean judgeCircle(String moves) {
        int countU = 0, countD = 0, countL = 0, countR = 0;
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'U'){
                countU++;
            }
            else if(ch == 'D'){
                countD++;
            }
            else if(ch == 'R'){
                countR++;
            }
            else if(ch == 'L'){
                countL++;
            }
        }
        if(countU == countD && countL == countR){
            return true;
        }
        return false;
    }
}