// Last updated: 7/14/2026, 9:30:37 PM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        List < List < Integer >> ans = new ArrayList < > ();
4        Arrays.sort(candidates);
5        findCombinations(0, candidates, target, ans, new ArrayList < > ());
6        return ans;
7    }
8    static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
9        if (target == 0) {
10            ans.add(new ArrayList < > (ds));
11            return;
12        }
13
14        for (int i = ind; i < arr.length; i++) {
15            if (i > ind && arr[i] == arr[i - 1]) continue;
16            if (arr[i] > target) break;
17
18            ds.add(arr[i]);
19            findCombinations(i + 1, arr, target - arr[i], ans, ds);
20            ds.remove(ds.size() - 1);
21        }
22    }
23}