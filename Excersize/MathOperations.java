package Excersize;
//7.	Initialize 2 numbers and initialize 1 char variable for mathematical operator. Find the sum, difference, product and quotient and remainder depending on the mathematical operator value. (Use switch statement).
public class MathOperations {

	public static void main(String[] args) {

		double num1 = 77.0;
		double num2 = 5;
		char operator = '*';
		double result;

		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println("Sum: " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println("Difference: " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("Product: " + result);
			break;
		case '/':

			result = num1 / num2;
			System.out.println("Quotient: " + result);

			break;
		case '%':
			result = num1 % num2;

			break;
		default:
			System.out.println("Invalid operator");
		}
	}
}
