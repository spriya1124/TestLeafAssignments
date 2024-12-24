package week1.day2;

public class FindPositiveNumber {

	public static void main(String[] args) {
		//int num = -10;
		for (int i=-10; i<=10; i++) {
		if(i>0) {
			System.out.println("Print Positive Number:"+i);
		} else if (i<0) {
			System.out.println("Print Negative Number:"+i);	
		}
		}
	}
}
