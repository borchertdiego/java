package entities;

public class Student {

	public String name;
	public double noteOne, noteTwo, noteThree;
	
	public double finalNote() {
		
		return noteOne + noteTwo + noteThree;
	}
	
	public String toString() {
		
		if (finalNote() < 60) {
			
			return "FINAL GRADE = " 
				 + String.format("%.2f", finalNote()) 
				 + "\nFAILED"
				 + "\nMISSING "
				 + String.format("%.2f", (60 - finalNote()))
				 + " POINTS";
		}
		
		return "FINAL GRADE = " + String.format("%.2f", finalNote()) + "\nPASS";
	}
	
	/*
	 * Melhor maneira de ser feito, porque assim você delega o cálculo dos pontos
	 * para o objeto estudantes e não tira a principal função do toString.
	 * 
	 * public double missingPoints() { 
	 * 
	 * 		if (finalGrade() < 60.0) { 
	 * 
	 * 			return 60.0 - finalGrade(); 
	 * 		} 
	 * 		else { 
	 * 
	 * 			return 0.0; 
	 * 		}
	 * }
	 * 
	 */
}
