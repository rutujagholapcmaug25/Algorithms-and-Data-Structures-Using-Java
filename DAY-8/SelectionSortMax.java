import java.util.*;

class SelectionSortMax{
	static void Selection(int[] arr){
		for(int i = 0; i < arr.length; i++){
			// find the max item in the remaining array and swap with correct index
			int last = arr.length - i - 1;     // last index
			int maxIndex = getMaxIndex(arr, 0, last);
			swap(arr, maxIndex, last);
		}
	}
	
	static int getMaxIndex(int arr[], int start, int end){
		int max = start;
		
		for(int i = start; i <= end; i++){
			if(arr[max] < arr[i]){
				max =  i;
			}
		}
		return max;
	} 
	
	static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
	public static void main(String args[]){
		int arr[] = {12, 11, 13, 5, 6};
		Selection(arr);
		System.out.println(Arrays.toString(arr));
	}
}

// [5, 6, 11, 12, 13]
