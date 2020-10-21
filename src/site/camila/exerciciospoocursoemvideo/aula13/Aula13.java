package site.camila.exerciciospoocursoemvideo.aula13;

public class Aula13 {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Lobo lobo = new Lobo();

		cachorro.reagir("Olá");
		cachorro.reagir("Vai apanhar");
		cachorro.reagir(11, 45);
		cachorro.reagir(21, 00);
		cachorro.reagir(true);
		cachorro.reagir(false);
		cachorro.reagir(2, 12.5);
		cachorro.reagir(17, 4.5);
		
		
		cachorro.emitirSom();
		
	}

}
