package site.camila.exerciciospoocursoemvideo.aula12;

public class Peixe extends Animal {
	//atributo
	private String corEscama; 
	
	//método
	public void soltarBolha() {
		System.out.println("Soltou uma bolha.");		
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando.");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Substâncias.");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não emite som.");
	}
	
	//métodos especiais
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	public String getCorEscama() {
		return this.corEscama;
	}
}
