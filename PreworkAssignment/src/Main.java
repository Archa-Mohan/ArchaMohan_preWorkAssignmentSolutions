import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {

		System.out.println("\nEnter the number to check for palindrome: \n");

		int number = sc.nextInt(); // User input for checking palindrome number.

		int temp1 = number; // store the input in a temporary variable.

		int temp2 = 0; // Initialize the temporary variable

		while (temp1 > 0) {

			int reminder = temp1 % 10;

			temp1 /= 10;

			temp2 = (temp2 * 10) + reminder;

		}

		System.out.println();

		if (temp2 == number) {

			System.out.println(number + " is its own palindrome .\n");

		} else {

			System.out.println(number + " does not have a palindrome.\n");

		}

	}

	// function to printPattern

	public void printPattern() {

		boolean emptySpaceCondition = false;

		System.out.println("\nEnter the number of levels: \n");

		int count = sc.nextInt(); // Getting the user input

		System.out.println();

		if (count > 0) {

			for (int i = 0; i <= count - 1; i++) { // i is for the outer loop iteration

				for (int j = 1; j <= count; j++) { // j is for ineer loop iteration

					int temp1 = count - i;

					if (j <= temp1) {

						emptySpaceCondition = false;

					} else {

						emptySpaceCondition = true;

					}

					if (emptySpaceCondition) {

						System.out.print(" ");

					} else {

						System.out.print("*");

					}

				}

				System.out.println();

			}
		} else {

			System.out.println("The number of levels should be greater than 0.");

		}

		System.out.println();

	}

	// function to check no is prime or not

	public void checkPrimeNumber() {

		System.out.println("\nEnter the number to check if it is prime or not: \n");

		int number = sc.nextInt(); // Getting the user input

		int factors = 2; // The number and one are the two factors.

		System.out.println();

		if (number > 1) {

			for (int i = 2; i <= number / 2; ++i) {

				if (number % i == 0) {

					factors++;

					System.out.println("The number " + number + " is not a prime number. \n");

					break;

				}

			}

			if (factors == 2) {

				System.out.println("The number " + number + " is a prime number.\n");

			}

		}

		if (number == 0 || number == 1) {

			System.out.println("The number " + number + " is neither a prime nor a composite number.\n");
		}

	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		int first = 0, second = 1;

		// Initializing the first and second value as 0, 1 respectively.

		System.out.println("\nEnter the size of Fibonacci series: \n");

		int seriesLength = sc.nextInt(); // Getting the user input.

		if (seriesLength == 0 || seriesLength == 1 || seriesLength == 2) {

			System.out.println("\nEnter size greater than 2.\n\n");

		}

		if (seriesLength > 2) {

			System.out.print("\nThe Fibonacci series of size " + seriesLength + " is " + first + ", " + second);

			for (int i = 0; i < seriesLength - 2; i++) {

				int temp1 = 0;

				temp1 = first + second;

				System.out.print(", " + temp1);

				first = second;

				second = temp1;

			}

			System.out.print(".\n\n");

		}

	}

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
