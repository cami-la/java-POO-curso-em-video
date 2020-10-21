package site.camila.exerciciospoocursoemvideo.aula13;

public abstract class Animal {
	//atributos
	protected double peso;
	protected int idade;
	protected int membros;
	
	public abstract void emitirSom();

	//métodos especiais
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}	
	
}
