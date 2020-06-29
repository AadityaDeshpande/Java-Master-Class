/* Practice example 8: Area and perimeter of a circle using OOP.



Write a program which calculates area and perimeter of a circle.

Implement the same using object oriented programming.

The mathematical formula for perimeter of a circle is 2*pi*r where pi= 3.14 and r is the radius of the circle. Formula for area is pi*r*r

Steps:

Create a class named Circle.

Use a parameterised constructor to assign radius value.

Create a method called area which returns the value of the area.

Create another method called perimeter which returns the value of perimeter.

Create a Circle object in the main method and invoke the area and perimeter method to display values. */

class Circle{
	public static double pi = 3.14; 
	
	int radius;
	
	public Circle(int radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	
	double area() {
		return pi*radius*radius;
	}
	
	double perimeter() {
		return 2*pi*radius;
	}
}



public class Assign8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir = new Circle(10);
		System.out.println("Area is "+ cir.area());
		System.out.println("Perimeter is "+ cir.perimeter());
	}

}
