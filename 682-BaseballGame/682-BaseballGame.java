// Last updated: 7/15/2026, 2:06:32 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op:operations){
            if(op.equals("C")){
                stack.pop();
            }else if(op.equals("D")){
                stack.push(2* stack.peek());
            }else if(op.equals("+")){
                int top = stack.pop();
                int newscore = top + stack.peek();
                stack.push(top);
                stack.push(newscore);
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int score : stack){
            sum += score;
        }
        return sum;
    }
}