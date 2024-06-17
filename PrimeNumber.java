import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}

// This program checks if a given number is prime or not. It prompts the user to
// enter a number, reads the input using a Scanner object, and then checks if
// the number is prime by iterating from 2 to the square root of the number and
// checking if the number is divisible by any of the integers in that range. If
// the number is prime, it prints a message indicating that the number is prime;
// otherwise, it prints a message indicating that the number is not prime. The
// program also closes the Scanner object to release any resources it may be
// using.