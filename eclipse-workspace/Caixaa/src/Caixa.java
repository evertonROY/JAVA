
public class Caixa {

	public double caixacomp = 2500;
	
	public void depositar(double caixa){
		caixacomp += caixa;
	}
	
	public void sacar(double caixa) {
		caixacomp -= caixa;
	}
	
	public void extrato() {
		System.out.println(caixacomp);
	}
}