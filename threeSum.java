class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> res = new LinkedList<>();
        
        for(int i = 0; i < nums.length-2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                
                int l = i+1, hi = nums.length-1, sum = 0 - nums[i];
                
                while(l < hi){
                    if(nums[l]+nums[hi] == sum){
                        res.add(Arrays.asList(nums[i], nums[l], nums[hi]));
                        
                        while(l < hi && nums[l] == nums[l+1])l++;   //to skip duplicate low values
                        while(l < hi && nums[hi] == nums[hi-1])hi--; //to skip duplicate high values
                        
                        l++; hi--;
                    }
                    else if(nums[l]+nums[hi] < sum)l++;
                    else hi--;
                }
            }
        }
        return res;
    }
}