package site.camila.exerciciospoocursoemvideo.aula13;

public class Mamifero extends Animal {
	//atributos
	protected String corPelo;
	
	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero");
	}
	//métodos especiais
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
