// Last updated: 7/15/2026, 2:09:41 PM
class Solution {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        int end = 1;
        int start = x/2;
        while(end <= start){
            int mid = end +(start - end)/2;
            if(mid == x/mid){
                return mid;
            }else if(mid < x/mid){
                end = mid +1;
            }else{
                start = mid - 1;
            }
        }
        return start;
    }
}