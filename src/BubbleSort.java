
public class BubbleSort {
	public static void bubbleSort(int[] arr,int len){

		int temp = 0;
		for(int i=0;i<len;i++){
			for(int j=1;j<len-i;j++){
				if(arr[j-1]>arr[j]){
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}

}
