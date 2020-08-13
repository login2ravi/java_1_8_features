package StreamPackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceTest {
	
	private Optional<Student> getHighestPercentage(StudentData data) {
		 return data.getStudentData().stream()
		 .reduce((a1,a2)->{
			 if(a1.getPercentMarks() > a2.getPercentMarks()) {
				 return a1;
			 }else {
				 return a2;
			 }
		 });
		 
				
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		
		int result = numbers.stream()
				.peek((a) -> System.out.println("Debug="+a))

				.reduce(1,(a,b) -> a + b);
		System.out.println("Result =="+result);
		
		StudentData data = new StudentData();
		
		ReduceTest test = new ReduceTest();
		Optional<Student> stud = test.getHighestPercentage(data);
		stud.isPresent();
		System.out.println("Stud = "+stud.isPresent());
		System.out.println("Stud = "+stud.get().getName());
			
	}

}
