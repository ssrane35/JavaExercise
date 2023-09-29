package Excersize;
//8.	Print even numbers from 1 to 10 using for, while, do-while.
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Using for loop:");
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("Using while loop:");
		int num = 2;
		while (num <= 10) {
			System.out.println(num);
			num += 2;
		}
		System.out.println("Using do-while loop:");
		int num2 = 2;
		do {
			System.out.println(num2);
			num2 += 2;
		} while (num2 <= 10);

	}

}
