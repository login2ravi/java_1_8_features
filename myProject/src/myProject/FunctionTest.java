package myProject;

import java.util.function.Function;

public class FunctionTest {
	
	public static void main(String ar[]) {	

		Function<String,String> fun = (name) -> {return name.toUpperCase();};
		Function<String,String> funConcat = (name) -> {return name.concat("-Ravi");};
		
		System.out.println("Function And Then =="+fun.andThen(funConcat).apply("java"));
		System.out.println("Function Compose =="+fun.compose(funConcat).apply("java"));
	}

}
