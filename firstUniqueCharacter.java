class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int len = s.length();
        char[] sArray = s.toCharArray();
        for(char c: sArray){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }
        int ans = 0;
        for(int i = 0; i < len; i++){
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i)) == 1){
                   ans = i; 
                   break;
                }else{
                    ans = -1;
                }
            }
        }
        return ans;
    }
}