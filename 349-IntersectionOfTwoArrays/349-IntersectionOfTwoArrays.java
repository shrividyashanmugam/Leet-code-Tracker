// Last updated: 7/15/2026, 2:07:18 PM
import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set = new HashSet<>();
       HashSet<Integer> resultSet = new HashSet<>();
       for(int n : nums1){
        set.add(n);
       }
       for(int n:nums2){
        if(set.contains(n)){
            resultSet.add(n);
        }
       }
        int[] answer = new int[resultSet.size()];
        int i =0;
        for(int n:resultSet){
            answer[i++]=n;
        }
        return answer;
       
       
        
    }
}