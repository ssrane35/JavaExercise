package Excersize;

//9.	Print odd numbers from 1 to 10 using for, while, do-while.
public class OddNumbers {
	public static void main(String[] args) {
		System.out.println("Using for loop:");
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("Using while loop:");
		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			num += 2;
		}
		System.out.println("Using do-while loop:");
		int num2 = 1;
		do {
			System.out.println(num2);
			num2 += 2;
		} while (num2 <= 10);

	}
}
