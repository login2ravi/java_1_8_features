package StreamPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class StudentData {
	
	
	public List<Student> getStudentData(){
		List<Student> studentList = new ArrayList<Student>();
		
		Student student = null;
		student = new Student();
		student.setName("Ravi");
		student.setGradeLevel("B-grade");
		student.setPercentMarks(50);;
		
		List<String> activites = new ArrayList<String>();
		activites.add("Cricket");
		activites.add("Football");
		activites.add("Garden");
		
		student.setActivities(activites);
		
		studentList.add(student);
		
		
		student = new Student();
		student.setName("AVS");
		student.setGradeLevel("A-grade");
		student.setPercentMarks(90);;
		
		activites = new ArrayList<String>();
		activites.add("Cooking");
		activites.add("TV");
		activites.add("Garden");
		
		student.setActivities(activites);
		
		studentList.add(student);
		return studentList;
	}
	
	Supplier<List<Student>> studentSupplier = ()->{
		return getStudentData();
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
