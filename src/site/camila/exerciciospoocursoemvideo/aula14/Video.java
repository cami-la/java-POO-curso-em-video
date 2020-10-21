package site.camila.exerciciospoocursoemvideo.aula14;

public class Video implements AcoesVideo {
	private String titulo;
	private String avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;	
	
	@Override
	public void play() {
		if (this.getReproduzindo()) {
			this.setReproduzindo(false);			
		} else {
			this.setReproduzindo(true);
		}
		
	}
	@Override
	public void pause() {
		if (this.getReproduzindo()) {
			this.setReproduzindo(false);			
		} else {
			this.setReproduzindo(true);
		}		
	}
	@Override
	public void like() {
		this.setCurtidas(this.getCurtidas() + 1);
		
	}
	
	//métodos especiais
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public String getAvaliacao() {
		return this.avaliacao;
	}
	
	public void setViews(int views) {
		this.views = views;
	}
	
	public int getViews() {
		return this.views;
	}
	
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public int getCurtidas() {
		return this.curtidas;
	}
	
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	public boolean getReproduzindo() {
		return this.reproduzindo;
	}
	
}
