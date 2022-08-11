package exeAnma;

public class Animal {
	
String nome;
String raca;
int numeroPatas = 0;

int passos = 0;
boolean alimentado = false;

void alimentar() {
	alimentado = true;
	passos = 0;
}

void andar() {
	
	if (this.alimentado && this.passos < 100) {
		this.passos ++;
		System.out.println("Andou " + this.passos + " Passos");
	}else {
		System.out.println("alimente o animal");
	}
}

void emitirSom(String som) {
	System.out.println("O animal emitiu um som: " + som);
}
	
}
 