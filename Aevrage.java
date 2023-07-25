// Create a java program that acepts three numbers from the user and displays the sum of the largest of the three numbers.?

import java.util.Scanner;

public class Aevrage {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers.
        System.out.println("Enter three numbers:");

        // Read the three numbers from the user.
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        // Find the largest number.
        int largestNumber = Math.max(number1, Math.max(number2, number3));

        // Calculate the sum of the largest number.
        int sum = largestNumber + largestNumber + largestNumber;

        // Display the sum of the largest number.
        System.out.println("The sum of the largest number is " + sum);
    }
}