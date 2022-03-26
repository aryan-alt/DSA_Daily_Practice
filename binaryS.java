class Solution {
    int binaryS(int[] arr, int l, int hi, int x){
        if(hi >= l){
            int mid = l + (hi-l)/2;
            
            if(arr[mid] == x){
            return mid;
            }else if (arr[mid] > x){
            return binaryS(arr, l, mid - 1, x);
            }else{
      // Search the right half
            return binaryS(arr, mid + 1, hi, x);
        } 
    }
       return -1; 
        
    }
    public int search(int[] nums, int target) {
        int low = 0;
        int n = nums.length - 1;
        
        return binaryS(nums, low, n, target);
    }
}