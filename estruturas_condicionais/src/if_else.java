import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hours;
		
		hours = sc.nextInt();
		
		if (hours < 12) {
		
			System.out.println("Bom dia");
		}
		else if (hours >= 12 && hours < 18) {
			
			System.out.println("Boa tarde");
		}
		else {
			
			System.out.println("Boa noite");
		}
		
		sc.close();
	}

}
