package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		x.a = sc.nextDouble(); 
		x.b = sc.nextDouble(); 
		x.c = sc.nextDouble();
		
		y.a = sc.nextDouble(); 
		y.b = sc.nextDouble(); 
		y.c = sc.nextDouble();
		
		double areax = x.calcArea();
		double areay = y.calcArea();
		
		System.out.printf("Area X: %.4f\n", areax);
		System.out.printf("Area Y: %.4f\n", areay);
		
		if (areax > areay) {
			
			System.out.println("X > Y");
		}
		else {
			
			System.out.println("Y > X");
		}
		
		sc.close();
	}

}
