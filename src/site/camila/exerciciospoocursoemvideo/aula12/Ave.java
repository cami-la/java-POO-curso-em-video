package site.camila.exerciciospoocursoemvideo.aula12;

public class Ave extends Animal {
	//atributo
	private String corPena; 
		
	//método
	public void fazerNinho() {
		System.out.println("Fez um ninho.");		
	}
		
	@Override
	public void locomover() {
		System.out.println("Voando.");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo insetos.");
	}

	@Override
	public void emitirSom() {
		System.out.println("Aves cantam.");
	}
		
	//métodos especiais
	public void setCorEscama(String corPena) {
		this.corPena = corPena;
	}
		
	public String getCorPena() {
		return this.corPena;
	}
}
