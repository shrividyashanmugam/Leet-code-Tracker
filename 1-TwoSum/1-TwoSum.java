// Last updated: 7/15/2026, 2:10:49 PM
class Solution {
    public int[] twoSum(int[] arr, int target) {
        for(int i=1 ; i<arr.length ; i++){
            for(int j=i ; j<arr.length ; j++){
                if(arr[j-i]+arr[j]==target){
                    return new int[]{j-i,j};
                }
            }
        }
     
    return new int[]{};
    }
}