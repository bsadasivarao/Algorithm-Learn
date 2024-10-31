package algolearn.array;

public class FindMissingNumberinArray {

	public static void main(String[] args) {
		int[] arr= {2,4,1,8,6,7,3,10,5};
		FindMissingNumberinArray finMissingNumberinArray=new FindMissingNumberinArray();
		int missingNumber=finMissingNumberinArray.findMissingNumber(10,arr);
		System.out.println(missingNumber);
	}
	
	public int findMissingNumber(int arrSize,int[] arr) {
		int size=(arrSize*(arrSize+1))/2;
		int sum=0;
		for (int i : arr) {
			sum=sum+i;
		}
		return size-sum;
		
	}

}
