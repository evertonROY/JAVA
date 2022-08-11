package exeAnma;

public class Principal {

	public static void main(String[] args) {
		Gato bia = new Gato();
		Cachorro rox = new Cachorro();
		bia.andar();
		bia.alimentar();
		bia.andar();
		bia.emitirSom("Miauu");
		rox.emitirSom("au au au");
	}

}
