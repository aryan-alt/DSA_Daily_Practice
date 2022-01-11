import java.util.*;
public class Main
{
   public static int binarySearch(int[] arr, int key, int low, int high){
        	while(low <= high){
		    int mid = (low+high)/2;
		    if(arr[mid] == key){
		        return mid;
		    }else if(key > arr[mid]){
		        low = mid+1;
		    }else{
		        high = mid - 1;
		    }
		}
		
		return -1;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int len = scn.nextInt();
		int[] arr = new int[len];
		for(int i = 0; i < len; i++){
		    arr[i] = scn.nextInt();
		}
		int key = scn.nextInt();
		int low = 0;
		int high = len - 1;
		
		System.out.println(binarySearch(arr, key, low, high));
		
	}
}
