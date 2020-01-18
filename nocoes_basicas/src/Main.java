public class Main {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG ";
		
		System.out.println("Original: -" + original + "-");
		
		//formatação
		System.out.println("Lower: -" + original.toLowerCase() + "-");
		System.out.println("Upper: -" + original.toUpperCase() + "-");
		System.out.println("Trim: -" + original.trim() + "-");
		
		//recortar
		System.out.println("Substring: -" + original.substring(3) + "-");
		System.out.println("Substring: -" + original.substring(3, 10) + "-");
		
		//substituir
		System.out.println("Substring: -" + original.replace("a", "1") + "-");
		System.out.println("Substring: -" + original.replace("abc", "123") + "-");
		
		//indice
		System.out.println("Index: " + original.indexOf("cd"));
		System.out.println("Last Index: " + original.lastIndexOf("ab"));
		
		//split
		
		for (int i = 0; i < original.split(" ").length; i++) {
			
			System.out.println("Split: " + original.split("A")[i]); 
		}
 	}
}
