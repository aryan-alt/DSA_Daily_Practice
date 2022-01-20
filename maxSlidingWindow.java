class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int idx = 0;
        for(int i = 0; i < n; i++){
            while(!dq.isEmpty() && dq.peek() == i - k){
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.offer(i);
            if(i >= k - 1){
                ans[idx++] = nums[dq.peek()]; 
            }
        }
        return ans;
    }
}