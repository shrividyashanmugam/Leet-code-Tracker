// Last updated: 7/28/2026, 9:22:11 PM
class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int n = s.length();
        int targetZeros = 0;
        for(int i=0;i< n;i++){
            if(s.charAt(i) == '0')
                targetZeros++;
        }
        int[] prefs = new int[n];
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '0')
                cnt++;
            prefs[i]=cnt;
        }
        boolean[] ans = new boolean[strs.length];
        for(int k =0;k<strs.length;k++)
            {
                String target = strs[k];
                int fixedZeros=0;
                int wild=0;
                for(int i=0;i<n;i++){
                    char c = target.charAt(i);
                    if(c == '0')
                        fixedZeros++;
                    else if(c == '?')
                        wild++;
                }
                if(fixedZeros > targetZeros || fixedZeros + wild <targetZeros){
                    ans[k]=false;
                    continue;
                }
                int need = targetZeros - fixedZeros;
                int prefixZeros = 0;
                int used = 0;
                boolean ok = true;
                for(int i =0;i<n;i++){
                    char c =target.charAt(i);
                    if(c=='0')
                        prefixZeros++;
                    else if(c =='?' && used < need){
                        prefixZeros++;
                        used++;
                    }
                    if(prefixZeros < prefs[i]){
                        ok = false;
                        break;
                    }
                }
                ans[k] = ok;
            }
        return ans;
    }
}