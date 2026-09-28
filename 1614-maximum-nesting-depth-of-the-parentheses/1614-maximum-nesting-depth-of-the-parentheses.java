class Solution {
    public int maxDepth(String s) {
        int maxDepth = Integer.MIN_VALUE;
        int depth = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            }
            else if(ch == ')'){
                depth--;
            }
        }
        if(maxDepth == Integer.MIN_VALUE){
            return 0;
        }
        return maxDepth;
    }
}