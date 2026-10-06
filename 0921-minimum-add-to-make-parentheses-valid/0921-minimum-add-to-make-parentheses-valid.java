class Solution {
    public int minAddToMakeValid(String s) {
        return function(s);
    }
    static int function(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }
            else if(!stack.isEmpty() && ch == ')' && stack.peek() == '('){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}