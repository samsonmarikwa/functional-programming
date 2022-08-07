package section5.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(34, 67, 8, 23, 67, 89, 90);
		
		Consumer<Integer> consumer = e -> System.out.println(e);
		
		consumer.accept(120);
		
		printElements(list, consumer);

	}

	private static <T> void printElements(List<T> list, Consumer<T> consumer) {
		list.stream().forEach(a -> consumer.accept(a));
	}

}
