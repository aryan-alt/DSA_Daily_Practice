class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> colSet = new HashSet<Integer>();
        for(int num: nums){
            colSet.add(num);
        }
        int streak = 0;
        for(int num: nums){
            if(!colSet.contains(num-1)){
                int curNum = num;
                int count  = 1;
                while(colSet.contains(curNum+1)){
                    curNum += 1;
                    count += 1;
                }
                streak = Math.max(streak, count);
            }
        }
        
        return streak;
    }
}