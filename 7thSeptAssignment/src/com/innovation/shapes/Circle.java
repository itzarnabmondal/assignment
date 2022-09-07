package com.innovation.shapes;

public class Circle {

	private float radius;
	static float pi = 3.5F;

	// Constructor 1
	public Circle() {
		radius = 1.5F;
	}

	// Constructor - 2
	Circle(float radius) {
		this(10.5F, 3.5F);
		this.radius = radius;

	}

	// cons - 3
	public Circle(float radius, float pi) {
		// cons chaining using cons 2
		this.radius = radius;
	}

	// methods
	static float calculateCircleArea(float radius) {
		return pi * radius * radius;
	}

	static float calculateCircumference(float radius) {
		return 2 * pi * radius;
	}

	public static void main(String[] args) {
		System.out.println("Circle Area is: " + calculateCircleArea(10.5F));
		System.out.println("Circumference is: " + calculateCircumference(10.5F));
	}
}