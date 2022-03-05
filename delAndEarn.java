class Solution {
    public int deleteAndEarn(int[] nums) {
        int inc = 0, exc = 0;
        int count[] = new int[10001];
        
        for(int ent: nums)count[ent]++;
        
        for(int i = 0; i <= 10000; i++){
            int vali = exc+count[i]*i;
            int vale = Math.max(inc, exc);
            
            inc = vali;
            exc = vale;
        }
        
        return Math.max(inc, exc);
    }
}