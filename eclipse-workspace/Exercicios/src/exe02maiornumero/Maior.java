package exe02maiornumero;

public class Maior {

	private double maior = 0;
	int numero1 = 0;
	int numero2 = 0;
	
	public void setMaior(float numero1) {
		
		 if (numero1 < numero2){
			 this.maior = numero2;
		 }else {
			 this.maior = this.numero1;
		 }
	}
	
	public double getMaior(){
		return maior;
	}
}
