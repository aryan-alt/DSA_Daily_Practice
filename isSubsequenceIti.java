class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        int len1 = s.length();
        int len2 = t.length();
        
        for(int i = 0; i < len2 && j < len1; i++){
            if(s.charAt(j) == t.charAt(i))
                j++;
        }
        
        return (j==len1);
    }
}