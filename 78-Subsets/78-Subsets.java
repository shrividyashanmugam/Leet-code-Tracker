// Last updated: 7/15/2026, 2:09:32 PM
import java.util.*;

class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> subset) {
        // Add current subset to result
        result.add(new ArrayList<>(subset));

        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);               // Include element
            backtrack(nums, i + 1, subset);   // Recurse
            subset.remove(subset.size() - 1); // Backtrack
        }
    }
}