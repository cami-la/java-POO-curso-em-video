package site.camila.exerciciospoocursoemvideo.aula12;

public class Reptil extends Animal {
	//atributos
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Rastejando.");
	}

	@Override
	public void alimentar() {
		System.out.println("Vegetais.");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Réptil.");
	}
	
	//métodos especiais
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	public String getCorEscama() {
		return this.corEscama;
	}
	
}
