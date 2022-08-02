package com.samsonmarikwa.functionalprogramming.section1;

import com.samsonmarikwa.functionalprogramming.section2.MyFuncInterface;

public class LambdaUnderTheHood {

	public static void main(String[] args) {
		MyFuncInterface fun = new MyFuncInterface() {
			
			@Override
			public void myMethod() {
				System.out.println("Implementation 1");
				
			}
		};

	}

}
