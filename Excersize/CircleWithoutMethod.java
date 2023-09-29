package Excersize;

//10.	Find area and circumference of a circle, given its radius.  Do this once without using methods and once using static methods for area & circumference
import java.util.Scanner;

public class CircleWithoutMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius of the circle: ");
		double radius = input.nextDouble();

		double area = Math.PI * radius * radius;
		double circumference = 2 * Math.PI * radius;

		System.out.println("Area of the circle: " + area);
		System.out.println("Circumference of the circle: " + circumference);

	}
}
