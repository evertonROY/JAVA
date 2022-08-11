
public class Conversor {

	public double moeda = 1;
	public double Dolar = 5.21;
	public double Euro = 5.33;
	
	public double dolar(double Moeda) {
		this.moeda = Moeda * Dolar;
		return moeda;
	}

	public double euro(double Moeda) {
		this.moeda = Moeda * Euro;
		return moeda;
	}
	
}
