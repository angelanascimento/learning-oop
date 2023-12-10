package main;

import java.util.Locale;
import java.util.Scanner;

import devsuperior_geometric.Rectangle;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //colocar antes da instância da classe scanner
		Scanner entry = new Scanner(System.in);	
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		double width = entry.nextDouble();
		double height = entry.nextDouble();
		
		rectangle.setWidth(width);
		rectangle.setHeight(height);
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		entry.close();
	}

}
