package week1.day2;

public class FindMatchingelement {

	public static void main(String[] args) {
		int[] array1 = {3, 2, 11, 4, 6, 7};
        int[] array2 = {1, 2, 8, 4, 9, 7};

        // Use nested for loops to compare each element in both arrays
        for (int i = 0; i < array1.length; i++) { // Outer loop for array1
            for (int j = 0; j < array2.length; j++) { // Inner loop for array2
                if (array1[i] == array2[j]) { // Compare elements
                    System.out.println("Matching elements :"+array1[i]); // Print matching element
                }
            }
	}
}
}