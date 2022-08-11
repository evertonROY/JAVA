import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
        
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os minutos");
		double minutos = entrada.nextDouble();
		
		if (minutos <= 100) {
		 System.out.println("valor a pagar = " + 50);
		}else {
			double juros = ((minutos - 100)*2) + 50 ;
			System.out.println("valor a pagar =" + juros );
		}
	}
}
