package com.samsonmarikwa.functionalprogramming.section3;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {
		// Imperative Programming Style - How to do
		int sumOfEvens = 0;
		for (int i = 0; i <= 100; i++) {
			
			if(i % 2 == 0) {
				sumOfEvens += i;
			}
			
		}
		System.out.println(sumOfEvens);
		
		
		// Declarative or Functional Programming Style - what to do
		int asInt = IntStream.rangeClosed(1, 100).filter(x -> x % 2 == 0).reduce((x, y) -> x + y).getAsInt();
		System.out.println(asInt);

	}

}
