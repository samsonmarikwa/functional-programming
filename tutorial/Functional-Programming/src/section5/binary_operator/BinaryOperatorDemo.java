package section5.binary_operator;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		
		BinaryOperator<String> biOperator = (a, b) -> (a + " " + b).toUpperCase();
		
		System.out.println(biOperator.apply("Samson", "Marikwa"));

	}

}
