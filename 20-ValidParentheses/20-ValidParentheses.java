// Last updated: 7/15/2026, 2:10:21 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(ch==')'&& top !='(' || ch==']'&& top !='[' ||ch=='}'&& top !='{'  ){
                    return false;
                }
            }
        }
            return stack.isEmpty();

    }
}