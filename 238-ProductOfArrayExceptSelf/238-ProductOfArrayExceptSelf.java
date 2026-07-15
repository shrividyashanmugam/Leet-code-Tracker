// Last updated: 7/15/2026, 2:07:46 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        answer[0]=1;
        for(int i = 1;i<n;i++){
            answer[i]=answer[i-1]*nums[i-1];
            
        }
        int rig = 1;
        for(int i= n-1;i>=0;i--){
            answer[i]=answer[i]*rig;
            rig=rig*nums[i];
        }
        return answer;
        
    }
}