package com.samsonmarikwa.NoParameterNoReturn;

public class LambdaExample1 {

	public static void main(String[] args) {
		Name name = () -> System.out.println("No Parameter no return");
		name.myName();
	}
	
	public void myName() {
		System.out.println("No Parameter no return");
	}
}
