package funcao;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numOne = sc.nextInt(),
			numTwo = sc.nextInt(),
			numThree = sc.nextInt();
		
		showHigher(numOne, numTwo, numThree);
		
		sc.close();
	}

	public static void showHigher(int x, int y, int z) {
		
		if (x > y && x > z) {
			
			System.out.println("Higher: " + x);
		}
		else if (y > z) {
			
			System.out.println("Higher: " + y);
		}
		else {
			
			System.out.println("Higher: " + z);
		}
	}
}
