package site.camila.exerciciospoocursoemvideo.aula14;

public class Visualizacao {
	//atributos
	private Gafanhoto espectador;
	private Video filme;
	
	//métodos
	public void avaliar() {
		this.getFilme().setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.getFilme().setAvaliacao(nota);

	}
	
	public void avaliar(double porc) {
		int tot = 0;
		if (porc >=20) {
			tot = 3;
		} else if (porc  <= 50) {
			tot = 5;
		} else if (porc <= 90) {
			tot = 8;
		} else {
			tot = 10;
		}
		this.getFilme().setAvaliacao(tot);
	}
	
	//métodos especiais
	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.setEspectador(espectador);
		this.setFilme(filme);
		this.espectador.setToAssistindo(this.espectador.getToAssistindo() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}
	
	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}
	
	public Gafanhoto getEspectador() {
		return this.espectador;
	}
	
	public void setFilme(Video filme) {
		this.filme = filme;
	}
	
	public Video getFilme() {
		return this.filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + 
				this.getEspectador().getNome() + 
				", filme=" + this.getFilme().getTitulo() +
				", assistiu=" + this.getEspectador().getToAssistindo() + 
				", views=" + this.getFilme().getViews() + 
				", avaliação=" + this.getFilme().getAvaliacao() + "]";
				}
	
	
}
