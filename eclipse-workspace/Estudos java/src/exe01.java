import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Horas trabalhadas");
		double horasT = entrada.nextDouble();
		System.out.println("Valor por hora");
		double valorH = entrada.nextDouble();
		double calculo = horasT * valorH;
	    System.out.println("Você vai receber " + calculo + "R$");
		entrada.close();
		
		
	}

}
