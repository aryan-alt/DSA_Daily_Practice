import java.util.*;
import java.lang.Math;

public class findWeight{

     public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int[] sumArr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int sum  = 0;
        for(int i = 0; i < n; i++){
            int val = (int)Math.sqrt(arr[i]);
            if(val*val == arr[i]){
                sum += 5;
            }
            
            if((arr[i] % 4 == 0) && (arr[i] % 6 == 0)){
                sum += 4;
            }
            
            if(arr[i] % 2 == 0){
                sum += 3;
            }
            
            sumArr[i] += sum;
            sum = 0;
            
        }
        int temp = 0, temp1 = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(sumArr[j]>=sumArr[j+1]){
                    temp=sumArr[j];
                    temp1= arr[j];
                    sumArr[j]=sumArr[j+1];
                    arr[j]=arr[j+1];
                    sumArr[j+1]=temp;
                    arr[j+1]=temp1;
            }
} }
    for(int i = n-1; i >= 0; i--){
    System.out.println(sumArr[i]);
}
        
        
        
    
     }
}