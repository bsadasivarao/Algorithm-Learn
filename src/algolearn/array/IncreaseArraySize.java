package algolearn.array;

public class IncreaseArraySize {

	public static void main(String[] args) {
		int[] arr= {5,3,9,10};
		IncreaseArraySize increaseArraySize=new IncreaseArraySize();
		int[] resized=increaseArraySize.increaseSizeofArray(arr, arr.length*2);
		for (int i : resized) {
			System.out.println(i);
		}
	}
	public int[] increaseSizeofArray(int[] arr,int size) {
		int[] newArr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			newArr[i]=arr[i];
		}
		return newArr;
		
	}

}
