package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import devsuperior.Student;

//import devsuperior.Employee;
//import devsuperior.Rectangle;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //colocar antes da instância da classe scanner
		Scanner entry = new Scanner(System.in);	
		
		//Exercício 03 - Aluno
		Student student = new Student();
		List<Double> grades = new ArrayList<>();
		
	
		student.setName(entry.nextLine());
		
		grades.add(entry.nextDouble());
		
		grades.add(entry.nextDouble());
	
		grades.add(entry.nextDouble());
		
		student.setGrades(grades);
		System.out.printf("FINAL GRADE = %.2f%n", student.sumGrades());
		System.out.println(student.checkStatus());
		
		
		/*//Exercício 02 - Funcionário
		Employee employee = new Employee();
		System.out.print("Name: ");
		String name = entry.nextLine();
		employee.setName(name);
		
		System.out.print("Gross salary: ");
		double grossSalary = entry.nextDouble();
		employee.setGrossSalary(grossSalary);
		
		System.out.print("Tax: ");
		double tax = entry.nextDouble();
		employee.setTax(tax);
		
		System.out.println("");
		System.out.printf("Employee: %s, $%.2f%n", employee.getName(), employee.netSalary());
		
		System.out.println("");
		System.out.print("Which percentage to increase salary? ");
		double increase = entry.nextDouble();
		employee.increaseSalary(increase);
		
		System.out.println("");
		System.out.printf("Updated data: %s, $%.2f", employee.getName(), employee.getGrossSalary());*/
		
		/*//Exercício 01 - Retângulo
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		double width = entry.nextDouble();
		double height = entry.nextDouble();
		
		rectangle.setWidth(width);
		rectangle.setHeight(height);
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());*/
		
		entry.close();
	}

}
