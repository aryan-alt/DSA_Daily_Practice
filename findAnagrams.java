class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<Integer>();
        
        if(s.length() == 0 || s == null)return ans;
        
        int[] fchar = new int[26];
        for(char x: p.toCharArray()){
            fchar[x-'a']++;
        }
        
        int left = 0;
        int right = 0;
        int cnt = p.length();
        
        while(right < s.length()){
            if(fchar[s.charAt(right++)-'a']-- >= 1) cnt--;
            
            if(cnt == 0)ans.add(left);
            
            if(right - left == p.length() && fchar[s.charAt(left++)-'a'] ++ >= 0)cnt++;
        }
       
        return ans;
    }
    
    
}