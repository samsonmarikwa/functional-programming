package section5.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Samson", "Mwamadi", "Annet", "Leonard");
		Function<String, Integer> func = a -> a.length();
		List<Integer> integers = map(func, list);
		System.out.println(integers);
		
		Function<String, String> funcA = a -> a.toUpperCase();
		List<String> strings = map(funcA, list);
		System.out.println(strings);
		
		System.out.println(list.stream().map(element -> funcA.apply(element)).toList());

	}

	private static <T, R> List<R> map(Function<T, R> func, List<T> list) {
		
		List<R> integerList = new ArrayList<>();
		for (T e : list) {
			R integer = func.apply(e);
			integerList.add(integer);
		}
		
		return integerList;
	}

}
