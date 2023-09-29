package Excersize;

import java.util.Scanner;
//10.	Find area and circumference of a circle, given its radius.  Do this once without using methods and once using static methods for area & circumference
public class CircleStaticMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius of the circle: ");
		double radius = sc.nextDouble();

		double area = Circle.calculateArea(radius);
		double circumference = Circle.calculateCircumference(radius);

		System.out.println("Area of the circle: " + area);
		System.out.println("Circumference of the circle: " + circumference);

	}
}

class Circle {
	public static double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}

	public static double calculateCircumference(double radius) {
		return 2 * Math.PI * radius;
	}
}
