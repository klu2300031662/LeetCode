class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<Character> upper = new HashSet<>();
        String str1 = "QWERTYUIOPqwertyuiop";
        for(int i=0; i<str1.length(); i++){
            upper.add(str1.charAt(i));
        }
        HashSet<Character> middle = new HashSet<>();
        str1 = "ASDFGHJKLasdfghjkl";
        for(int i=0; i<str1.length(); i++){
            middle.add(str1.charAt(i));
        }
        HashSet<Character> lower = new HashSet<>();
        str1 = "ZXCVBNMzxcvbnm";
        for(int i=0; i<str1.length(); i++){
            lower.add(str1.charAt(i));
        }
        for(int i=0; i<words.length; i++){
            if(upperCheck(words[i], upper) || middleCheck(words[i], middle) || lowerCheck(words[i], lower)){
                list.add(words[i]);
            }
        }
        String[] result = new String[list.size()];
        int i = 0;
        for(String temp : list){
            result[i] = temp;
            i++;
        }
        return result;
    }
    static boolean upperCheck(String str, HashSet<Character> hs){
        for(int i=0; i<str.length(); i++){
            if(!hs.contains(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
    static boolean middleCheck(String str, HashSet<Character> hs){
        for(int i=0; i<str.length(); i++){
            if(!hs.contains(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
    static boolean lowerCheck(String str, HashSet<Character> hs){
        for(int i=0; i<str.length(); i++){
            if(!hs.contains(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}