package myProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Print{
	void printMessage(String msg);
}

public class LamdaTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LamdaTest obj = new LamdaTest();
		
		
		Print printMsg = (msg) -> {
			System.out.println("Welcome"+msg);
		};
		
		Print emptyPrint = (msg) -> {
			System.out.println("Welcome default"+msg);
		};
		
		printMsg.printMessage("Ravi");
		emptyPrint.printMessage("Ravi");
		
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		int j = 10;
		int k=10;

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> k*j).collect(Collectors.toList());
		
		
		
		
		squaresList.forEach(System.out::println);
		//System.out.println(squaresList);
		
	}

}
