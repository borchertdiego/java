package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		
		student.noteOne = sc.nextDouble();
		
		student.noteTwo = sc.nextDouble();
		
		student.noteThree = sc.nextDouble();
		
		System.out.print(student);
		
		/*
		 * Melhor maneira de ser feito
		 * 
		 * if (student.finalGrade() < 60.0) {
		 *		System.out.println("FAILED");
		 *		System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		 *	} else {
		 *		System.out.println("PASS");
		 *	}
		 */
		
		sc.close();
	}
}
