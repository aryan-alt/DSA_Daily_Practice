import java.util.*;

public class insertionSort{
     
     public static void insSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j;
            for(j = i-1; j >= 0; --j){
                if(arr[j] > key){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                     arr[j] = temp;
                }
                
            }
         
        }
     }
     
     public static void main(String []args){
        int[] data = {9,5,1,4,3};
        insertionSort.insSort(data);
        
        System.out.println("Sorted after insertion sort");
        System.out.println(Arrays.toString(data));
     }
}