package com.samsonmarikwa.functionalprogramming.section2;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		
		MyFuncInterface myFunc = () -> System.out.println("Hello");
		
		myFunc.myMethod();

	}
}
