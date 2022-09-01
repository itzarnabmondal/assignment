package com.cognizant.shapes;
import java.util.Scanner;
public class AreaCalculator_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth: ");
		int breadth = sc.nextInt();
		Rectangle_3 obj = new Rectangle_3();
		obj.calculateArea(length, breadth);
	}
}