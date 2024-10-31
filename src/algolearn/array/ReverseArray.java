package algolearn.array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {2,11,5,10,8,7,1};
		ReverseArray reverseArray=new ReverseArray();
		reverseArray.reverseArray(arr);
		for (int i : arr) {
			System.out.print(" "+i);
		}
	}

	public void reverseArray(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while (start<end) {
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
			
		}
		
	}
}