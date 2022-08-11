import java.util.ArrayList;
import java.util.Scanner;

public class exe09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		ArrayList<String> agenda = new ArrayList<>();
		int entre = 0;

		while (entre != 5) {

			System.out.println("    ======  AGENDA  ======     ");
			System.out.println("-------------------------------");
			System.out.println("1 - ADD contato           |");
			System.out.println("2 - Excluir contato       |");
			System.out.println("3 - Procurar contato      |");
			System.out.println("4 - Mostrar contatos      |");
			System.out.println("5 - Sair                  |");
			System.out.println("-------------------------------");
			entre = entrada.nextInt();

			if (entre == 1) {

				System.out.println("Nome do contato a adcionar?");
				String nome = entrada.next();
				agenda.add(nome);

			} else if (entre == 2) {

				System.out.println("ID do contato a excluir?");
				int ind = entrada.nextInt();
				agenda.remove(ind);

			} else if (entre == 3) {

				System.out.println("Lista de contatos");
				for (String ctt : agenda) {
					System.out.println("Nome: " + ctt);
				}

			} else if (entre == 4) {

        for (String ctt : agenda) {
					System.out.println();
				}

			} else if (entre == 5) {

				System.out.println("Sistema finalizado!");

			} else {
				System.out.println("Não reconhecido!");
			}
		}

	}

}

