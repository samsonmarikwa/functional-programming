package com.FunctionalGenericsLambda;

public class FunctionalGenericsDemo {
	
	public static void main(String[] args) {
		
		FunctionalGenerics<String, String> funcA = s -> s.substring(2, 5);
		String result1 = funcA.execute("Samson");
		System.out.println(result1);
		
		FunctionalGenerics<String, Integer> funcB = s -> s + "concatenated";
		String result2 = funcB.execute(100);		
		System.out.println(result2);
		
		FunctionalGenerics<Integer, String> funcC = s -> s.length();
		int result3 = funcC.execute("Samson");		
		System.out.println(result3);
		
	}

}
