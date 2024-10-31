package dineshvariyani.array;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int arr[]= {0,1,0,4,12};
		MoveZerosToEnd moveZerosToEnd=new MoveZerosToEnd();
		moveZerosToEnd.moveZerosToEnd(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	public void moveZerosToEnd(int[] arr) {
		int zeroPos=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0&&arr[zeroPos]==0) {
				arr[zeroPos]=arr[i];
				arr[i]=0;
				
			}
			if(arr[zeroPos]!=0) {
				zeroPos++;
			}
			
		}
	}

}
