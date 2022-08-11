package exe02maiornumero;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Maior maiorNum = new Maior();
		System.out.println("Digite o Primeiro numero!");
		maiorNum.numero1 = entrada.nextInt();
		System.out.println("Digite o Segundo numero!");
		maiorNum.numero2 = entrada.nextInt();
		maiorNum.setMaior(7);
		System.out.printf("O maior numero digitado foi %.0f", maiorNum.getMaior());
		
	}

}
