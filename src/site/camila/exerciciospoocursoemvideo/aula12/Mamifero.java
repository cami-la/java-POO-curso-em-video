package site.camila.exerciciospoocursoemvideo.aula12;

public class Mamifero extends Animal {
	//atributos
	private String corPelo;

	@Override
	public void locomover() {
		System.out.println("Correndo.");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando.");

	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero.");
	}
	
	//métodos especiais
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	public String getCorPelo() {
		return this.corPelo;
	}
	
}
