package myProject;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		numbers.stream().forEach(System.out::println);
		List list = numbers.stream().map(i -> i + i).collect(Collectors.toList());
		list.stream().forEach(System.out::println);
		

	}

}
