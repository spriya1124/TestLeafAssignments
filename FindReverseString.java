package week1.day3;

public class FindReverseString {

	public static void main(String[] args) {
		String CompName = "TestLeaf";
		char[] comp = CompName.toCharArray();
		for (int i = comp.length-1; i>=0; i--) {
		//System.out.println(comp[i]);
		System.out.print(comp[i]);
		}

	}

}
