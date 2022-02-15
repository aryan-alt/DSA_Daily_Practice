class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        int n = jewels.length();
        int m = stones.length();
        int cnt = 0, ini = 0;
        for(int i = 0; i < m; i++){
            if(!mp.containsKey(stones.charAt(i))){
                mp.put(stones.charAt(i), 0);
            }
            ini = mp.get(stones.charAt(i));
            mp.put(stones.charAt(i), ini += 1);
        }
        
        for(int i = 0; i < n; i++){
            if(mp.containsKey(jewels.charAt(i))){
                cnt += mp.get(jewels.charAt(i));
            }
        }
        
        return cnt;
    }
}