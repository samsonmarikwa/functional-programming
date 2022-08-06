package com.samsonmarikwa.WithParameterNoReturn;

public class LambdaExample2 {

	public static void main(String[] args) {
		Firstname name = firstname -> System.out.println(firstname);
		name.myName("Samson");
		
		FirstnameLastname fnameLname = (fname, lname) -> System.out.println("Firstname: " + fname + " Lastname: " + lname);
		fnameLname.myName("Samson", "Marikwa");
		
		MathOperation add = (a, b) -> System.out.println(a + b);
		add.operation(10, 5);
		
		MathOperation multiply = (a, b) -> System.out.println(a * b);
		multiply.operation(10, 5);
		
		MathOperation division = (a, b) -> System.out.println(a / b);
		division.operation(10, 5);
		
		MathOperation subtraction = (a, b) -> System.out.println(a - b);
		subtraction.operation(10, 5);
		
	}
	
}
