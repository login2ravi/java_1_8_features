package myProject;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
interface MyMessage{
	void printMsg(Integer i);
}

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p = (i) -> {return (i%2 == 0);};
		Predicate<Integer> p2 = (i) -> {return (i%5 == 0);};
		
		System.out.println("TEst=="+p.test(4));
		System.out.println("Both =="+p.and(p2).test(10));
		
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		
		Predicate<Integer> evenPredicate = (i) -> {return i%2==0;};
		
		
		MyMessage msgEven = (i) -> { System.out.println("Even Number"+i);};
		MyMessage msgOdd = (i) -> { System.out.println("Odd Number"+i);};
		
		numbers.forEach((i) -> {
			if(evenPredicate.test(i) == true) {
				msgEven.printMsg(i);
			}else {
				msgOdd.printMsg(i);
			}
			});
		
		Consumer<Integer> test = (i) -> { System.out.println("Hi"+i);};
		Consumer<Integer> test1 = (i) -> { System.out.println("Welcome"+i);};
		numbers.forEach( (i) ->
				test.andThen(test1).accept(i));
		
		
		
		
	}

}
