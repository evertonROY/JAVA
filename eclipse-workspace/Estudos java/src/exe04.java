import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double acumulador = 0;
		
		System.out.println("Digite 10 valores e nós diremos quantos valores existem entre 10 e 20!");
		
		for (int i = 1; i <=10; i++) {
			System.out.println(i +"° Tentativa");
			double valor = entrada.nextDouble();
			if (valor >= 10 && valor <= 20) {
				acumulador += 1;
				System.out.println(acumulador);
			}
		}
	System.out.printf("Fim! Você digitou %.2f" , acumulador);
	}
}
