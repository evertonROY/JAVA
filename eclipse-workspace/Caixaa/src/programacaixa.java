import java.util.Scanner;

public class programacaixa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Caixa banc = new Caixa();
		banc.extrato();
		System.out.println("Digite o valor a depositar");
		banc.depositar(entrada.nextDouble());
		banc.extrato();
		System.out.println("Digite o valor a sacar");
		banc.sacar(entrada.nextDouble());
		banc.extrato();
	}

}
