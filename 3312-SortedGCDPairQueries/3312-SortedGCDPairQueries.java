// Last updated: 7/17/2026, 3:15:12 PM
1class Solution {
2    public int[] gcdValues(int[] nums, long[] queries) {
3        int maxVal = 0;
4        for (int num : nums) {
5            maxVal = Math.max(maxVal, num);
6        }
7        
8        // Count frequencies of each number
9        long[] cnt = new long[maxVal + 1];
10        for (int num : nums) {
11            cnt[num]++;
12        }
13        
14        // Count how many elements are multiples of each i
15        long[] multiples = new long[maxVal + 1];
16        for (int i = 1; i <= maxVal; i++) {
17            for (int j = i; j <= maxVal; j += i) {
18                multiples[i] += cnt[j];
19            }
20        }
21        
22        // Count pairs with exact GCD = i using backward Inclusion-Exclusion DP
23        long[] gcdCount = new long[maxVal + 1];
24        for (int i = maxVal; i >= 1; i--) {
25            long pairs = (multiples[i] * (multiples[i] - 1)) / 2;
26            for (int j = 2 * i; j <= maxVal; j += i) {
27                pairs -= gcdCount[j];
28            }
29            gcdCount[i] = pairs;
30        }
31        
32        // Compute prefix sums of GCD frequencies
33        long[] prefixSums = new long[maxVal + 1];
34        for (int i = 1; i <= maxVal; i++) {
35            prefixSums[i] = prefixSums[i - 1] + gcdCount[i];
36        }
37        
38        // Answer each query using binary search
39        int[] ans = new int[queries.length];
40        for (int k = 0; k < queries.length; k++) {
41            long q = queries[k];
42            ans[k] = upperBinarySearch(prefixSums, q);
43        }
44        
45        return ans;
46    }
47    
48    // Finds the first index where prefixSums[index] > target
49    private int upperBinarySearch(long[] prefixSums, long target) {
50        int low = 1;
51        int high = prefixSums.length - 1;
52        int ans = high;
53        
54        while (low <= high) {
55            int mid = low + (high - low) / 2;
56            if (prefixSums[mid] > target) {
57                ans = mid;
58                high = mid - 1; // Look for a smaller index
59            } else {
60                low = mid + 1;
61            }
62        }
63        return ans;
64    }
65}