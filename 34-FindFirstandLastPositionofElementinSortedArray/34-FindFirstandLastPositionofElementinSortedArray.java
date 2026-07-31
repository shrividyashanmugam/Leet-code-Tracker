// Last updated: 7/31/2026, 9:34:31 AM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] result = new int[]{-1, -1};
4        
5        result[0] = findBound(nums, target, true);   // Find first position
6        if (result[0] == -1) {
7            return result; // Target doesn't exist in array
8        }
9        
10        result[1] = findBound(nums, target, false);  // Find last position
11        return result;
12    }
13    
14    private int findBound(int[] nums, int target, boolean isFirst) {
15        int left = 0, right = nums.length - 1;
16        int bound = -1;
17        
18        while (left <= right) {
19            int mid = left + (right - left) / 2;
20            
21            if (nums[mid] == target) {
22                bound = mid;
23                if (isFirst) {
24                    right = mid - 1; // Keep searching left to find first occurrence
25                } else {
26                    left = mid + 1;  // Keep searching right to find last occurrence
27                }
28            } else if (nums[mid] < target) {
29                left = mid + 1;
30            } else {
31                right = mid - 1;
32            }
33        }
34        
35        return bound;
36    }
37}