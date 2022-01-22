import java.util.*;

public class selectionSort{

     public static void selSort(int[] arr, int size){
         
         for(int i = 0; i < size - 1; i++){
             int min = i; //assign the index value of first element in the array
             for(int j = i+1; j < size; j++){
                 if(arr[j] < arr[min]){
                     min = j;  //assign the new value for min
                 }
             }
             
             int temp = arr[i];
             arr[i] = arr[min];
             arr[min] = temp;
         }
     }
     public static void main(String []args){
        int[] data = {20, 12, 10, 15, 2};
        int n = data.length;
        selectionSort.selSort(data,n);
        System.out.println("Sorted using Selection Sort:-");
        System.out.println(Arrays.toString(data));
     }
}