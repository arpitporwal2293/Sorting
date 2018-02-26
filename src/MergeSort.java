
public class MergeSort {

	private static int[] tempMergArr = new int[10];
	
	public static void mergeSort(int arr[],int left,int right){
		if(left<right){
			int mid = (left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			sort(arr, left, right, mid);
		}
	}


	public static void sort(int[] arr,int left,int right,int mid){
		int i = left;
		int k = left;
		int j= mid+1;
		for (int l = left; l <= right; l++) {
            tempMergArr[l] = arr[l];
        }

		while(i<=mid && j<=right){
			if(tempMergArr[i]<=tempMergArr[j])
				arr[k++] = tempMergArr[i++];
			else
				arr[k++] = tempMergArr[j++];
		}

		while(i<=mid){
			arr[k++] = tempMergArr[i++];
		}

		while(j<=right){
			arr[k++] = tempMergArr[j++];
		}

		/*for(int l=0;l<arr.length;l++){
			arr[l] = c[l];
		}*/
	}
}
