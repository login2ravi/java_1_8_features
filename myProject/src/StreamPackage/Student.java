package StreamPackage;

import java.util.List;

public class Student {
	
	private String name;
	private String gradeLevel;
	private int percentMarks;
	private List<String> activities;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGradeLevel() {
		return gradeLevel;
	}
	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	public int getPercentMarks() {
		return percentMarks;
	}
	public void setPercentMarks(int percentMarks) {
		this.percentMarks = percentMarks;
	}
	public List<String> getActivities() {
		return activities;
	}
	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	
	

}
