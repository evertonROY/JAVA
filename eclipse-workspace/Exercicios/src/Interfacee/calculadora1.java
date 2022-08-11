package Interfacee;

public class calculadora1 implements Calculadora{
	double resultado;
	
	public double somar(double x, double y) {
		return this.resultado = x+y;
	}
	
	public void subtracao(double x, double y) {
		this.resultado = x-y;
		System.out.println(resultado);
	}
	public double raiz(double x) {
		return this.resultado = Math.sqrt(x);
	}
}
