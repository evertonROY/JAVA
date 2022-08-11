
public class Principal {

	public static void main(String[] args) {
		System.out.println("-----Sistema do Carro-----");
		Carro gol = new Carro();
		gol.modelo = "2022";
		gol.placa = "JNX-5I88";
		gol.acelerar();
		gol.frear();
		gol.acelerar();
		System.out.println("-----------------------------");
		
		
		System.out.println("-----Sistema do Caixa-----");
		Caixa caixa01 = new Caixa();
		caixa01.depositar(300);
		caixa01.sacar(1200);
		System.out.println(caixa01.extrato());

	}
	
	

}
