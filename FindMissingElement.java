package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

    public static void main(String[] args) {
        // Input array
        int[] num = {1, 4, 3, 2, 8, 6, 7};

        // Sort the array
        Arrays.sort(num);

        // Find and print the missing number
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] + 1 != num[i + 1]) {
                System.out.println("Missing number: " + (num[i] + 1));
                break;
            }
        }

        // If no missing number is found
        System.out.println("No missing number");
    }
}