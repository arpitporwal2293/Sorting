
public class Operations {
	
	public static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {10,4,8,6};
		MergeSort.mergeSort(arr, 0, arr.length-1);
		printArr(arr);
	}

}
