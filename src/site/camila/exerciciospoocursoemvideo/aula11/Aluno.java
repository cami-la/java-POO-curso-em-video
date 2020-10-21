package site.camila.exerciciospoocursoemvideo.aula11;

public class Aluno extends Pessoa {
	//atributos
	private int matricula;
	private String curso;
	
	//método
	public void pagarMensalidade() {
		System.out.println("O aluno " + this.getNome() + " está pagando a mensalidade!");
	}
	
	//métodos especiais
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getCurso() {
		return this.curso;	
	}
}
