package site.camila.exerciciospoocursoemvideo.aula14;

public abstract class Pessoa {
	//atributos
	protected String nome;
	protected int idade;
	protected String sexo;
	protected int experiencia;
	
	//métodos
	public abstract void ganharExeriencia();
	
	//métodos especiais

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public Pessoa(String nome, int idade, String sexo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setExperiencia(0);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + this.getNome() + 
				", idade=" + this.getIdade() + 
				", sexo=" + this.getSexo() + 
				", experiencia=" + this.getExperiencia() + "]";
	}
	
	
}
