package exeAnmaeu;

public class Animal {

	public int passos = 0;
	public int alimento = 0;
	public int totp = 0;
	void Alimentar() {
		System.out.println("Você alimentou o animal");
		this.alimento = 1;
		this.passos = 0;
	}
	
	void andar(){
		while(this.passos < 4) {
			this.passos ++;
			this.totp += 1;
			System.out.println("o Animal deu " + totp + " Passos!");
			
		}
		
		if(this.passos >= 4) {
			this.alimento = 0;
			System.out.println("Alimente o animal");
		}
	}
	
	
}