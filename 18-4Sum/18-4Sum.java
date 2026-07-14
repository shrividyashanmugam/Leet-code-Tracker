// Last updated: 7/14/2026, 9:23:46 PM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        Set<List<Integer>> set = new HashSet<>();
4        int n = nums.length;
5        Arrays.sort(nums);
6        if(n<4) 
7        return new ArrayList<>(set);  
8        for(int i=0;i<n-3;i++)
9        {
10            for(int j=i+1;j<n-2;j++)
11            {
12                int left=j+1;
13                int right=n-1;
14                while(left<right)
15                {
16                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];
17                    if(sum==target)
18                    {
19                        set.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
20                        left++;
21                        right--;
22                    }
23                    else if(sum>target)
24                    right--;
25                    if(sum<target)
26                    left++;
27                }
28            }
29        }
30        return new ArrayList<>(set);    
31    }
32}