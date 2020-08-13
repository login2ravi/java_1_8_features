package StreamPackage;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentData data = new StudentData();
		Map<String,String> map = data.getStudentData().stream()
				.peek((student) -> System.out.println(student.toString()))
				.filter((student) -> student.getPercentMarks() > 60)
			.collect(Collectors.toMap(Student::getName, Student::getGradeLevel));
		
		System.out.println(map);

	}

}
