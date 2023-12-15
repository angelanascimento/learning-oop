package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import devsuperior.BankAccount;
import devsuperior.CheckIn;
import devsuperior.CurrencyConverter;
import devsuperior.EmployeeTwo;
import devsuperior.Student;

//import devsuperior.Employee;
//import devsuperior.Rectangle;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //colocar antes da instância da classe scanner
		Scanner entry = new Scanner(System.in);	
		
		
		//Exercício 07 - Listas (Classe Funcionário 2)
		
		List<EmployeeTwo> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int number = entry.nextInt();
		
		for(int i = 1; i <= number; i++) {
			
			System.out.printf("%nEmployee #%d%n", i);
			System.out.printf("Id: ");
			int id = entry.nextInt();
			
			System.out.print("Name: ");
			entry.nextLine();
			String name = entry.nextLine();
			
			System.out.print("Salary: ");
			double salary = entry.nextDouble();
			
			employees.add(new EmployeeTwo(id, name, salary));
			
		}
		
		System.out.printf("%nEnter the employee id that will have salary increase: ");
		int id = entry.nextInt();
		
		EmployeeTwo result = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(result != null) {
			System.out.printf("Enter the percentage: ");
			double percentage = entry.nextDouble();
			result.increaseSalary(percentage);
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		System.out.printf("%nList of Employees: %n");
		for(EmployeeTwo x : employees) {
			System.out.println(x);
		}
		
	
		/*//Exercício 06 - Regitro de Aluguel
		System.out.print("How many rooms will be rented? ");
		int number = entry.nextInt();
		
		
		CheckIn[] rentals = new CheckIn[10];
	
		for(int i = 1; i <= number; i++ ) {
			
			System.out.printf("%nRent #%d:%n", i);
			System.out.print("Name: ");
			entry.nextLine();
			String name = entry.nextLine();
			
			System.out.print("E-mail: ");
			String email = entry.nextLine();
			
			System.out.print("Room: ");
			int room = entry.nextInt();
				
			rentals[room] = new CheckIn(name, email, room);
		}
		
		System.out.printf("%nBusy rooms:%n");
		for(int i = 0; i < rentals.length; i++) {
			if(rentals[i] != null) {
				System.out.println(rentals[i].toString());
			}
		}
		*/
		
		/*//Exercício 05 - Conta Bancária
		BankAccount bankAccount;
		double deposit;
		double withdraw;
		
		System.out.print("Enter account number: ");
		int numberAccount = entry.nextInt();
		
		System.out.print("Enter account holder: ");
		entry.nextLine();
		String accountHolder = entry.nextLine();
		
		
		System.out.print("Is there na initial deposit (y/n)? ");
		String initialDeposit = entry.next().toLowerCase();
		
		if(initialDeposit.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			deposit = entry.nextDouble();
			bankAccount = new BankAccount(numberAccount, accountHolder, deposit);
		}
		else {
			bankAccount = new BankAccount(numberAccount, accountHolder);
		}
		
		System.out.printf("Account data: %n%s%n%n", bankAccount.toString());
		
		System.out.print("Enter a deposit value: ");
		deposit = entry.nextDouble();
		bankAccount.deposit(deposit);
		System.out.printf("Update account data: %n%s%n%n", bankAccount.toString());
		
		System.out.printf("Enter a withdraw value: ");
		withdraw = entry.nextDouble();
		bankAccount.withdraw(withdraw);
		System.out.printf("Update account data: %n%s%n", bankAccount.toString());
		*/
		
		
		/*//Exercício 04 - Conversor de Moedas
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		currencyConverter.setDollarPrice(entry.nextDouble());
		
		System.out.print("How many dollars will be bought? ");
		currencyConverter.setValueToBuy(entry.nextDouble());
		
		System.out.printf("Amount to be paid in reais = %.2f", currencyConverter.amountToPay());*/
		
		
		/*//Exercício 03 - Aluno
		Student student = new Student();
		List<Double> grades = new ArrayList<>();
		
		student.setName(entry.nextLine());
		
		grades.add(entry.nextDouble());
		
		grades.add(entry.nextDouble());
	
		grades.add(entry.nextDouble());
		
		student.setGrades(grades);
		System.out.printf("FINAL GRADE = %.2f%n", student.sumGrades());
		System.out.println(student.checkStatus());*/
		
		
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
