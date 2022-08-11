import java.util.Scanner;

public class exe07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] nomes =new String[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i+1) +"° Nome!");
			nomes[i] = entrada.next();
		}
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(i + "-" + nomes[i]);
			System.out.println("----------");
		}
	}

}
