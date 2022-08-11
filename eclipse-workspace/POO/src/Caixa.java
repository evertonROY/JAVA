
public class Caixa {

	public double saldo = 2500;
	
	public void depositar(double Saldo) {
		this.saldo += Saldo;
	}
	
	public void sacar(double Saldo) {
		this.saldo -= Saldo;
	}
	
	public double extrato() {
		return saldo;
	}
}
