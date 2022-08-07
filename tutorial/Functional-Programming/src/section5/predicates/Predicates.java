package section5.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Basics");
		list.add("");
		list.add("");
		list.add("Strong");
		list.add("");
		list.add("BasicsStrong");
		
		System.out.println(list);
		
		Predicate<String> predicate = s -> !s.isEmpty();
		List<String> newList = filterList(list, predicate);
		System.out.println(newList);
		
		Predicate<String> predicate2 = s -> s.contains("Basic");
		List<String> listWithBasic = filterList(list, predicate2);
		System.out.println(listWithBasic);
		
		List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Predicate<Integer> predicate3 = i -> i % 2 == 0;
		List<Integer> evenIntegers = filterList(integers, predicate3);
		System.out.println(evenIntegers);
		System.out.println(integers.stream().filter(predicate3).toList());
		
	}

	private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
		List<T> newList = new ArrayList<>();
		
		for (T string : list) {
			if (predicate.test(string)) {
				newList.add(string);
			}
		}

		return newList;
	}

}
