package devsuperior;

public class EmployeeTwo {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public EmployeeTwo() {}
	
	public EmployeeTwo(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		double calc = this.salary * percentage / 100;
		this.salary += calc;
	}
	
	public String toString() {
		return String.format("%d, %s, %.2f", 
				this.getId(), 
				this.getName(), 
				this.getSalary());
	}
	
}
