import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(),
			soma = 0,
			firstNum = 160,
			secondNum = 32;
		
		for (int i = 0; i < N; i++) {
			
			int num = sc.nextInt();
			
			soma += num;	
		}
		
		System.out.println(soma);

		/* Testando bit a bit */
		
		if ((firstNum & secondNum) == secondNum) {
			
			System.out.println("true");
		}
		else
			
			System.out.println("false");
		
		
		
		sc.close();
	}

}
