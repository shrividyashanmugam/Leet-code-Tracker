// Last updated: 7/15/2026, 2:05:33 PM
class Solution {
    public int getLength(int[] nums) {
        int totalElement = nums.length;
        if(totalElement <= 1){
            return totalElement;
        }
        int a = 0;
        for(int left = 0 ;left < totalElement;left++){
            Map<Integer,Integer>  number = new HashMap<>();
            int[] freqLevel = new int[totalElement + 1];
            int p =0;
            for(int right = left;right<totalElement;right++){
                int val = nums[right];
                int oldFreq = number.getOrDefault(val,0);
                int newFreq = oldFreq +1;
                number.put(val,newFreq);
                if(oldFreq >0){
                    freqLevel[oldFreq]--;
                }
                freqLevel[newFreq]++;
                if(newFreq > p){
                    p = newFreq;
                }
                int totalUnique = number.size();
                if(right == left ||totalUnique == 1|| (p%2 == 0  && freqLevel[p] > 0 && freqLevel[p /2] > 0 && (freqLevel[p] + freqLevel[p/2]) == totalUnique)){
                    int currentSpan = right - left + 1;
                    if(currentSpan > a){
                        a = currentSpan;
                    }
                }
            }
        }
        return a; 
    }
}