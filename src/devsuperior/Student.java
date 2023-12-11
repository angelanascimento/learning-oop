package devsuperior;

import java.util.List;

public class Student {
	private String name;
	private List<Double> grades;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Double> getGrades() {
		return grades;
	}

	public void setGrades(List<Double> grades) {
		this.grades = grades;
	}

	public double sumGrades() {
		double count = 0;
		
		for(double i : grades) {
			count += i;
		}
		
		return count;
	}

	public String checkStatus() {
		if(sumGrades() >= 60) {
			return "PASS";
		}
		else {
			double p = 60 - sumGrades();
			return "FAILED MISSING " + p + " POINTS";
		}
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", grades=" + grades + "]";
	}
	
	
}
