package com.asgn1;
/*7*/
import java.util.Scanner;

/*Problem Statement: 
 * Design a class ‘Complex ‘with data members for real and imaginary part. Provide default andParameterized
 * constructors. Write a program to perform arithmetic operations of two complex numbers.
 */

public class Complex {
	double real=0.0;
	double img=0.0;
	public Complex() {				// default constructor
		
	}
	
	public Complex(double Real,double Img) {		// parameterized constructor
		real=Real;
		img=Img;
		
	}
	
	static void display(Complex n) {
		System.out.println(n.real+" +"+n.img+"i");
			
	}
	
	
	static Complex add(Complex c1,Complex c2) {
		Complex sum=new Complex();
		sum.real=c1.real+c2.real;
		sum.img=c1.img+c2.img;
		System.out.println(sum.real);
		return(sum);
	}
	
	static Complex subtract(Complex c1,Complex c2) {	//method should be static to assign it to variable
		Complex diff=new Complex();
		diff.real=c1.real-c2.real;
		diff.img=c1.img-c2.img;
		return(diff);
	
	}
	
	static Complex multiply(Complex c1,Complex c2) {	//method to multiply
		Complex product=new Complex();
		product.real=(c1.real*c2.real-c1.img*c2.img);
		product.img=(c1.real*c2.img+c2.real*c1.img);
		return(product);
	}
	
	static Complex divide(Complex c1,Complex c2) {
		double deno;
		Complex div=new Complex();
		deno = (c2.real*c2.real + c2.img*c2.img);
		div.real = (c1.real*c2.real + c1.img*c2.img)/deno; 
		div.img = (c2.real*c1.img - c1.real*c2.img)/deno;
		return(div);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex(1.0,2.0);		//first no.
		Complex c2=new Complex(3.0,4.0);		//second no.
		Complex c3;								//no. to store result
		int n;									// variable to store choice from user
		
	
		
		
		do {
		
		System.out.println("MENU");					//MENU
		System.out.println("Press 1 to add the numbers.");
		System.out.println("Press 2 to subtract the numbers.");
		System.out.println("Press 3 to multiply the numbers.");
		System.out.println("Press 4 to multiply the numbers.");
		System.out.println("Press 5 to exit.");
		Scanner sc=new Scanner(System.in);		//Scanner class is used to get input
		n=sc.nextInt();							// n is variable to store input
		switch(n) {
		
		case 1:		//add
			System.out.println("The sum of the two complex numbers is: ");
			c3=add(c1, c2);
			c3.display(c3);
			break;
			
		
		case 2:		//subtract
			System.out.println("The difference of the two complex numbers is: ");
			c3=subtract(c1, c2);
			c3.display(c3);
			break;
			
			
		case 3:		//divide
			c3=multiply(c1, c2);
			c3.display(c3);
			break;
			
			
		case 4:
			c3=divide(c1, c2);
			c3.display(c3);
			break;
			
			
		case 5:
			System.exit(0);
			break;
		
			
		default:
			System.out.println("Invalid choice!");
			
				
		}
		
		}
		while(true);
		
	}
	
}
