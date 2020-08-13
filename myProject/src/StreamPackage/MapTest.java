package StreamPackage;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {
	
	public static void main(String ar[]) {
		StudentData data = new StudentData();
		List<String> nameList = data.getStudentData().stream()  //Stream<Student>
			.map(Student ::getName)    //Stream<String>
			.collect(Collectors.toList());
		
		System.out.println("Name List="+nameList);
		
		List<String> activityList = data.getStudentData().stream() //Stream<Student>
				.map(Student ::getActivities)			//Stream<List<String>>
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Activity List==="+activityList);
		
		
		long count = data.getStudentData().stream() //Stream<Student>
				.map(Student ::getActivities)			//Stream<List<String>>
				.flatMap(List::stream)
				.distinct()
				.count();
		
		List<Student> gradeList = data.getStudentData().stream()  //Stream<Student>
				//.map(Student ::getGradeLevel)    //Stream<String>
				.sorted(Comparator.comparing(Student::getGradeLevel))
				.collect(Collectors.toList());
		
		gradeList.forEach((i) -> System.out.println(i.getName()));
		//System.out.println("gradeList =="+gradeList);
	}

}
