package dineshvariyani.array;

import java.util.Iterator;

public class SecondMaxValue {

	public static void main(String[] args) {
		int[] arr= {2,11,5,10,8,7,1};
		SecondMaxValue secondMaxValue=new SecondMaxValue();
		int secondMaxVal=secondMaxValue.secondMaxValueofArray(arr);
		System.out.println(secondMaxVal);

	}
	
	public int secondMaxValueofArray(int[] arr) {
		int seconMaxValue=Integer.MIN_VALUE;
		int maxValue=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>maxValue) {
				seconMaxValue=maxValue;
				maxValue=arr[i];
			}else if(arr[i]<maxValue&&arr[i]>seconMaxValue) {
				seconMaxValue=arr[i];
			}
		}
		
		return seconMaxValue;
	}

}
