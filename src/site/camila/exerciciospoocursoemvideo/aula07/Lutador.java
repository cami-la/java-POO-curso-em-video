package site.camila.exerciciospoocursoemvideo.aula07;

public class Lutador implements Lutadores{
	//atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	@Override
	public void apresentar() {
		System.out.println("----------");
		System.out.println("CHEGOU A HORA" + "\n" + "APRESENTAMOS O LUTADOR " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos");
		System.out.println("pesando " + this.getPeso() + "kg");
		System.out.println(this.getVitorias() + " vitorias");
		System.out.println(this.getEmpates() + " empates e ");
		System.out.println(this.getDerrotas() + " derrotas");
	}
	
	@Override
	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("ganhou " + this.getVitorias() + " vezes");
		System.out.println("empatou " + this.getEmpates() + " vezes");
		System.out.println("perdeu " + this.getDerrotas() + " vezes");
	}
	
	@Override
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	@Override
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
		
	}
	@Override
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
		
	}
	
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
			int vitorias, int derrotas, int empates) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);;
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "INVÁLIDO";
		} else if (this.getPeso() < 70.3) {
			this.categoria = "LEVE";
		} else if (this.getPeso() < 83.9) {
			this.categoria = "MÈDIO";
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "PESADO";
		} else {
			System.out.println("INVÀLIDO!");
		}
	}
	
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
}
