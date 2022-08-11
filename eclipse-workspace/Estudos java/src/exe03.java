import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		Scanner entradapais = new Scanner(System.in);
		String pais = entradapais.nextLine();
		Scanner entradavalor = new Scanner(System.in);
		double valor = entradavalor.nextDouble();
		
		switch (pais) {
		
		case "EUA":
			System.out.println("converter em Dolar " + valor*5.4082);
			break;
		case "CAD":
			System.out.println("converter em CAD " + valor*4.1514);
		    break;
		case "JPY":
			System.out.println("converter em JPY " + valor*0.03905);
			break;
		}

	}
}

/*
 * Scanner entrada = new Scanner(System.in);
 * 
 * String carro = entrada.nextLine(); 
 * System.out.println("o valor é " + carro);
 * 
 * if(carro == "popular"){ System.out.println("paga 90"); } else if(carro ==
 * ("luxo")){ System.out.println("paga 150"); }else {
 * System.out.println("algo errado"); }
 */
