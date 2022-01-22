import java.util.*;
import java.util.Arrays;
public class bubbleSort
{
    
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++){ //for accessing each element in array
            boolean swapStatus = false; //to check the swap status so that the iteration doesn't occur again and again
            for(int j = 0; j < (n - i - 1); j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    swapStatus = true;
                }                
            }
            
            if(!swapStatus){
                break;
            }
        }
    }
    
	public static void main(String[] args) {
		int[] data = { -2, 45, 0, 11, -9 };
		bubbleSort.bubbleSort(data);
		
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(data));
	}
}
