// Last updated: 7/31/2026, 9:33:10 AM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n = nums.length;
4        int i = n - 2;
5        
6        // 1. Find the first decreasing element from the right
7        while (i >= 0 && nums[i] >= nums[i + 1]) {
8            i--;
9        }
10        
11        // 2. If pivot found, find element just larger than nums[i] and swap
12        if (i >= 0) {
13            int j = n - 1;
14            while (nums[j] <= nums[i]) {
15                j--;
16            }
17            swap(nums, i, j);
18        }
19        
20        // 3. Reverse the elements after index i
21        reverse(nums, i + 1, n - 1);
22    }
23    
24    private void swap(int[] nums, int i, int j) {
25        int temp = nums[i];
26        nums[i] = nums[j];
27        nums[j] = temp;
28    }
29    
30    private void reverse(int[] nums, int start, int end) {
31        while (start < end) {
32            swap(nums, start, end);
33            start++;
34            end--;
35        }
36    }
37}