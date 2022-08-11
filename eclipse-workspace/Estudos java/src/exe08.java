import java.util.Scanner;

public class exe08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] nomes = new String[5];
		double[] dinheiro = new double[5];
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite o " + (i+1) + "° Nome!");
			nomes[i] = entrada.next();
			
			System.out.println("Digite o salario de " + nomes[i]);
			dinheiro[i] = entrada.nextDouble();
		}
		
		System.out.println("digite a operação +/- e o Reajuste!");
		double reajuste = entrada.nextDouble();
		
		for (int i = 0; i < nomes.length; i++) {
			dinheiro[i] = dinheiro[i] + dinheiro[i] * reajuste/100;
			
			System.out.println("-------------------|");
			System.out.println(nomes[i] + ", O seu salario com o Reajuste de " + reajuste + "% é " + dinheiro[i] + "R$");
		}
	}
}
