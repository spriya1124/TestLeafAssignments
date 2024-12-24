package week1.day2;
public class FindArraysDuplicateValue {

	public static void main(String[] args) {
		int[] allNum= {2,5,7,7,5,9,2,3};
		for (int i = 0; i < allNum.length; i++) {
			for (int j = i+1; j < allNum.length; j++) {
				if (allNum[i]==allNum[j]) {
					System.out.println(allNum[j]);	
				}
			}
		}
	}

}
