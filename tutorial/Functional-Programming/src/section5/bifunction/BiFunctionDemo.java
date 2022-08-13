package section5.bifunction;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {

		BiFunction<String, String, String> biFunction = (a, b) -> a + b;
		String concat = concatenateStrings("Samson", "Marikwa", biFunction);
		System.out.println(concat);
		System.out.println(biFunction.apply("Samson", "Marikwa"));
		
		BiFunction<String, String, Integer> biFunc = (a, b) -> (a + b).length();
		int len = biFunc.apply("Samson", "Marikwa");
		System.out.println(len);
	}

	private static String concatenateStrings(String string1, String string2,
			BiFunction<String, String, String> biFunction) {
		String str = biFunction.apply(string1, string2);
		return str;
	}

}
