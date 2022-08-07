package section5.supplier;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<String> supplier = () -> "String";
		
		String string = getValue(supplier);
		System.out.println(string);
		
		// Random number between 5 and 10
		// Min + (int)(Math.random() * (Max - Min + 1)
		Supplier<Integer> intValue = () -> 5 + (int)(Math.random() * (10 - 5 + 1));
		int num = getValue(intValue);
		System.out.println(num);	

	}

	private static<T> T getValue(Supplier<T> supplier) {
		return supplier.get();
	}

}
