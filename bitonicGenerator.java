class Solution
{
    void bitonicGenerator(long arr[], int n)
    {
        List<Long> even = new ArrayList<Long>();
        List<Long> odd = new ArrayList<Long>();
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        
        int i = 0;
        for (int j = 0; j < even.size(); j++) {
            arr[i++] = even.get(j);
        }
        for (int j = 0; j < odd.size(); j++) {
            arr[i++] = odd.get(j);
        }
        
    }