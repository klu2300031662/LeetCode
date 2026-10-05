class Solution {
    public boolean detectCapitalUse(String word) {
        if(condition(word)){
            return true;
        }
        return false;
    }
    static boolean condition(String word){
        int count = 0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                count++;
            }
        }
        if(count == word.length()){
            return true;
        }
        count = 0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                count++;
            }
        }
        if(count == word.length()){
            return true;
        }
        count = 0;
        for(int i=1; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                count++;
            }
        }
        if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
            count++;
        }
        if(count == word.length()){
            return true;
        }
        return false;
    }
}