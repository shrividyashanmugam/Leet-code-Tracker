// Last updated: 7/19/2026, 8:52:18 AM
1class Solution {
2    public boolean[] transformStr(String s, String[] strs) {
3        int n = s.length();
4        int targetZeros = 0;
5        for(int i=0;i< n;i++){
6            if(s.charAt(i) == '0')
7                targetZeros++;
8        }
9        int[] prefs = new int[n];
10        int cnt = 0;
11        for(int i=0;i<n;i++){
12            if(s.charAt(i) == '0')
13                cnt++;
14            prefs[i]=cnt;
15        }
16        boolean[] ans = new boolean[strs.length];
17        for(int k =0;k<strs.length;k++)
18            {
19                String target = strs[k];
20                int fixedZeros=0;
21                int wild=0;
22                for(int i=0;i<n;i++){
23                    char c = target.charAt(i);
24                    if(c == '0')
25                        fixedZeros++;
26                    else if(c == '?')
27                        wild++;
28                }
29                if(fixedZeros > targetZeros || fixedZeros + wild <targetZeros){
30                    ans[k]=false;
31                    continue;
32                }
33                int need = targetZeros - fixedZeros;
34                int prefixZeros = 0;
35                int used = 0;
36                boolean ok = true;
37                for(int i =0;i<n;i++){
38                    char c =target.charAt(i);
39                    if(c=='0')
40                        prefixZeros++;
41                    else if(c =='?' && used < need){
42                        prefixZeros++;
43                        used++;
44                    }
45                    if(prefixZeros < prefs[i]){
46                        ok = false;
47                        break;
48                    }
49                }
50                ans[k] = ok;
51            }
52        return ans;
53    }
54}