package Interfacee;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		calculadora1 calc = new calculadora1();
		System.out.println(calc.somar(entrada.nextDouble(), entrada.nextDouble()));
		System.out.println(calc.raiz(81));
		calc.subtracao(5, 2);
		

	}

}
