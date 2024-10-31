package algolearn.array;

public class Palindrome {

	public static void main(String[] args) {
		String str="maddamm";
		Palindrome palindrome=new Palindrome();
		boolean isPalindrome=palindrome.isGivenStringPalindrome(str);
		System.out.println(isPalindrome);
	}
	
	public boolean isGivenStringPalindrome(String inputStr) {
		boolean isPalindrome=true;
		char[] inputData=inputStr.toCharArray();
		int initSize=0;
		int lastSize=inputData.length-1;
		while (initSize<lastSize) {
			if(inputData[initSize]!=inputData[lastSize]) {
				isPalindrome=false;
			}
			initSize++;
			lastSize--;
			
		}
		return isPalindrome;
		
	}

}
