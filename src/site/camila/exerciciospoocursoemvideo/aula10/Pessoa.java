package site.camila.exerciciospoocursoemvideo.aula10;

public class Pessoa {
	//atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//método
	public void fazerAniversario() {
		this.setIdade(getIdade() + 1);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + this.getNome() + ",\n idade=" + this.getIdade() +
				",\n sexo=" + this.getSexo() + "]";
	}

	
}
