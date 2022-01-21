class calculateSpan{

public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int[] span = new int[n];
        span[0] = 1;
        
        Stack<Integer> idx = new Stack<Integer>();
        idx.push(0);
        
        for(int i = 1; i < n; i++){
            while(!idx.isEmpty() && price[idx.peek()] <= price[i]){
                idx.pop();
            }
            
            if(idx.isEmpty()){
                span[i] = i + 1;
            }else{
                span[i] = i - idx.peek();
            }
            idx.push(i);
        }
        return span;
    }

}