package week1.day2;
public class IsPrimeNumber {

    public static void main(String[] args) {
        // Input number to check
        int number = 100; // Change this number to test other values

        // Assume number is prime
        boolean isPrime = true;

        // Check divisors from 2 to number - 1
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false; // Found a divisor, not prime
                break; // Exit the loop
            }
        }

        // Numbers less than 2 are not prime
        if (number < 2) {
            isPrime = false;
        }

        // Print the result
        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
    }
}
