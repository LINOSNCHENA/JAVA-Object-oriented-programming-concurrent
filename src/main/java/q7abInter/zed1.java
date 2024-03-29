package q7abInter;
// Java program to illustrate the// concept of abstract class

import java.io.*;

// abstract class
abstract class Shape {
	// declare fields
	String objectName = " ";

	Shape(String name) {
		this.objectName = name;
	}

	// declare non-abstract methods
	// it has default implementation
	public void moveTo(int x, int y) {
		System.out.println(this.objectName + " " + "has been moved to" + " x = " + x + " and y = " + y);
	}

	// abstract methods which will be
	// implemented by its subclass(es)
	abstract public double area();

	abstract public void draw();
}
// ==========================================================
class Rectangle extends Shape {

	int length, width;

	// constructor
	Rectangle(int length, int width, String name) {

		super(name);
		this.length = length;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle has been drawn ");
	}

	@Override
	public double area() {
		return (double) (length * width);
	}
}
// ======================================================

class Circle extends Shape {
	double pi = 3.14;
	int radius;

	// constructor
	Circle(int radius, String name) {
		super(name);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle has been drawn ");
	}

	@Override
	public double area() {
		return (double) ((pi * radius * radius) / 2);
	}
}

class abstractExample1 {
	public static void main(String[] args) {
		System.out.print("\n =================|Rectangle_Vs_Cycle_3|=====================");
		// creating the Object of Rectangle class and using shape class reference.
		Shape rect = new Rectangle(2, 3, "Rectangle");
		System.out.println("\n Area of rectangle1: " + rect.area());
		rect.moveTo(1, 2);

		System.out.println(" ");

		// creating the Objects of circle class
		Shape circle = new Circle(2, "Circle");
		System.out.println("Area of circle1: " + circle.area());
		circle.moveTo(2, 4);
		System.out.print("=================|Rectangle_Vs_Cycle_4|=====================\n ");
	}
}
