package TaskofMotionCut;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        // Get input from the user
		        System.out.print("Enter the first number: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Enter the second number: ");
		        double num2 = scanner.nextDouble();

		        System.out.print("Choose an operation (+, -, *, /): ");
		        char operation = scanner.next().charAt(0);

		        // Perform the calculation based on the chosen operation
		        double result = 0;

		        switch (operation) {
		            case '+':
		                result = num1 + num2;
		                break;
		            case '-':
		                result = num1 - num2;
		                break;
		            case '*':
		                result = num1 * num2;
		                break;
		            case '/':
		                if (num2 != 0) {
		                    result = num1 / num2;
		                } else {
		                    System.out.println("Error: Cannot divide by zero.");
		                    System.exit(0); // Terminate the program
		                }
		                break;
		            default:
		                System.out.println("Error: Invalid operation.");
		                System.exit(0); // Terminate the program
		        }

		        // Display the result
		        System.out.println("Result: " + result);

		        // Close the scanner
		        scanner.close();
		    
		

	}

}
