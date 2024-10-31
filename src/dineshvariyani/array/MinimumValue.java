package dineshvariyani.array;

public class MinimumValue {

	public static void main(String[] args) {
		int[] arr= {2,11,5,10,8,7,1};
		MinimumValue minimumValue=new MinimumValue();
		int minValue=minimumValue.minimumValueinArray(arr);
		System.out.println(minValue);
		

	}

	public int minimumValueinArray(int[] arr) {
		int minimumValue=arr[0];
		for (int i : arr) {
			if(i<minimumValue) {
				minimumValue=i;
			}
			
		}
		
		
		return minimumValue;
	}
}
