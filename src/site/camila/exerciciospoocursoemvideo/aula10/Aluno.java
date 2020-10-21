package site.camila.exerciciospoocursoemvideo.aula10;

public class Aluno extends Pessoa {
	//atributos
	private int matricula;
	private String curso;

	public void cancelarMatricula() {
		System.out.println("Matrícula será cancelada!");
	}
	
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
