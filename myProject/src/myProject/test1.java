package myProject;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Consumer<Integer> consumer = number -> System.out::print;
		Consumer<Integer> consumer = number -> System.out.print(number+"");
		
		List<Integer> integerList = Arrays.asList(100,200,300);
		printList(integerList,consumer);

	}
	
	public static void printList(List<Integer> listOfIntegers,Consumer<Integer> consumer) {
		for(Integer integer:listOfIntegers) {
			consumer.accept(integer);
		}
	}

}
