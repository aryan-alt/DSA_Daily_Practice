class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
        List<Integer> x =  new ArrayList<Integer>();
        
        for(int i=0;i<nums1.length;i++){
            if(map1.containsKey(nums1[i])){
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }else{
                map1.put(nums1[i], 1);
            }
        }
        
        for(int i=0;i<nums2.length;i++){
            if(map2.containsKey(nums2[i])){
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            }else{
                map2.put(nums2[i], 1);
            }
        }
        
        
        for (int key : map1.keySet()) {
            if(map2.containsKey(key)){
                int nn = Math.min(map1.get(key) ,map2.get(key));
                for(int i=0;i<nn;i++){
                    x.add(key);
                }
                
            }
        }
        
        return x.stream().mapToInt(i -> i).toArray();
        
        
        
    }
}