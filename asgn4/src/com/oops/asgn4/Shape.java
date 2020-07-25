/**
 * 
 */
package com.oops.asgn4;

import java.util.Scanner;

/*
 * Problem Statement: 
 * Design a base class shape with two double type values and member functions to input the data and
	compute_area() for calculating area of figure. Derive two classes’ triangle and rectangle. Make
	compute_area() as abstract function and redefine this function in the derived class to suit their
	requirements. Write a program that accepts dimensions of triangle/rectangle and display calculated area.
	Implement dynamic binding for given case study.

 * */
/**
 * @author Yadgire_7
 *
 */
public abstract class Shape {			// abstract class needs to be created in order to
	double l,b;							// create abstract method
	void getData() {
		//this method is created to override in the derived classes
	}
	
	abstract void compute_area();	
	
	public static void main(String []args) {
		Shape t=new Triangle();			//dynamic binding
		t.getData();
		t.compute_area();
		Shape r=new Rectangle();		//dynamic binding
		r.getData();
		r.compute_area();
	}
}

class Triangle extends Shape{
	
	void getData() {				//overridden method
		
		System.out.println("Enter the base lenth and height of the triangle");
		Scanner base=new Scanner(System.in);
		l=base.nextDouble();
		
		Scanner height=new Scanner(System.in);
		b=base.nextDouble();
	}

	@Override
	void compute_area() {
		// TODO Auto-generated method stub
		System.out.println("The area of the triangle is: ");
		System.out.println((l*b)/2+" square units");
	}
	
}

class Rectangle extends Shape{
	
	void getData() {				//overridden method
		System.out.println("Enter the lenth and breadth of the rectangle");
		Scanner length=new Scanner(System.in);
		l=length.nextDouble();
		Scanner breadth=new Scanner(System.in);
		b=breadth.nextDouble();
	}

	@Override
	void compute_area() {
		// TODO Auto-generated method stub
		System.out.println("The area of the rectangle is: ");
		System.out.println(l*b+" square units");
	}
	
}
