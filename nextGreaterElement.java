 class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = greaterRight(nums2);
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums2.length; i++){
            hm.put(nums2[i], ans[i]);
        }
        
        int[] fans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            fans[i] = hm.get(nums1[i]);
        }
        
        return fans;
    }
    
    public int[] greaterRight(int[] arr){
        int[] ger = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        
        ger[arr.length - 1] = -1;
        stk.push(arr[arr.length - 1]);
        
        for(int i = arr.length - 2; i >= 0; i--){
            while(stk.size() > 0 && arr[i] >= stk.peek()){
                stk.pop();
            }
            if(stk.size() == 0){
                ger[i] = -1;
            }else{
                ger[i] = stk.peek();
            }
            
            stk.push(arr[i]);
        }
        return ger;
    }
}