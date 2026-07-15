// Last updated: 7/15/2026, 2:07:11 PM
class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            right += num;
            left = Math.max(num, left);
        }
    
        while(left <= right) {
            int mid = (right - left) / 2 + left;
            boolean exist = check(nums, k, mid);
            if (exist) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } 
        return left;
    }
    private boolean check (int[] nums, int k, int target) {
        int count = 1;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > target) {
                count++;
                sum = num;
            }
            if (count > k) {
                return false;
            }
        }
        return true;
    }
}