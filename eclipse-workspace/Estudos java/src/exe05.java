import java.util.Scanner;

public class exe05 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double cont = 1;
		double comp = 0;
		while (cont != 999) {
			double idade = entrada.nextDouble();
			cont = idade;
			if (idade > comp && idade != 999) {
				comp = idade;
				
			}
		}
		
		System.out.printf("A maior idade foi %.0f" , comp);
		
	}
}
