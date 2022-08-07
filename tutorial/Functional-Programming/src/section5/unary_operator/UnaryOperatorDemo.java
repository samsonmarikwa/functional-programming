package section5.unary_operator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(10, 20, 30, 40, 50);
		
		UnaryOperator<Integer> funcA = e -> e * 100;
		
		System.out.println(list.stream().map(element -> funcA.apply(element)).toList());
		
		List<Integer> newList = operate(list, funcA);
		System.out.println(newList);
		
		List<String> names = List.of("Samson", "Marikwa", "Annet", "Leonard");
		UnaryOperator<String> funcB = e -> e.toUpperCase();
		System.out.println(names.stream().map(element -> funcB.apply(element)).toList());
		
		List<String> newNames = operate(names, funcB);
		System.out.println(newNames);

	}

	private static <T> List<T> operate(List<T> list, UnaryOperator<T> funcA) {
		
		List<T> result = new ArrayList<>();
		for (T e : list) {
			result.add(funcA.apply(e));
		}
		return result;
	}



}
