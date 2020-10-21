package site.camila.exerciciospoocursoemvideo.aula09;

public class Livro implements Publicacao {
	//atributos
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//método
	
	
	//métodos especiais
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotalPaginas(totalPaginas);
		this.setAberto(false);
		this.setPaginaAtual(0);
		this.setLeitor(leitor);
	}
	

	public String detalhes() {
		return "Livro { " + "titulo=" + titulo + ", autor="
				+ autor + ",\n totalPaginas=" + totalPaginas
				+ ", paginaAtual=" + paginaAtual + ",\n aberto=" 
				+ aberto + ", leitor=" + leitor.getNome() +
				", idade=" + leitor.getIdade() + 
				" sexo=" + leitor.getSexo() + " }";
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getautor() {
		return this.autor;
	}
	
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	
	public int getTotalPaginas() {
		return this.totalPaginas;
	}
	
	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}
	
	public int getPaginaAtual() {
		return this.paginaAtual;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public boolean getAberto() {
		return this.aberto;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	public Pessoa getLeitor() {
		return this.leitor;
	}

	@Override
	public void abrir() {
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
	}

	@Override
	public void folhear(int pagina) {
		if (pagina > this.getTotalPaginas()) {
			System.out.println("Número da página excede o número toal de páginas do livro.");
		} else if (this.getAberto()) {
			this.setPaginaAtual(pagina);
		} else {
			System.out.println("Para folhear, o livro precisa estar aberto.");
		}
	}

	@Override
	public void avancarPagina() {
		if (this.getAberto()) {
			this.setPaginaAtual(this.getPaginaAtual() + 1);
		} else {
			System.out.println("Para avançar, o livro precisa estar aberto.");
		}
	}		

	@Override
	public void voltarPagina() {
		if (this.getAberto()) {
			this.setPaginaAtual(this.getPaginaAtual() - 1);
		} else {
			System.out.println("Para voltar, o livro precisa estar aberto.");
		}
	}
}
	
	
