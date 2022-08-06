package com.samsonmarikwa.WithParameterAndReturn;

public class LambdaExample3 {

	public static void main(String[] args) {
		Operation add = (a, b) -> a + b;
		int answer = add.operate(12, 4);
		System.out.println(answer);
	}

}
