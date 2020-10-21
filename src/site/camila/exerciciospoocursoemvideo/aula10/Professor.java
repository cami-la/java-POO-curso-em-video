package site.camila.exerciciospoocursoemvideo.aula10;

public class Professor extends Pessoa {
	//atributos
	private String especialidade;
	private double salario;
	
	//método
	public void receberAumento(double aumento) {
		this.setSalario(getSalario() + aumento);
	}
	
	//métodos especiais
		
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getEspecialidade() {
		return this.especialidade;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
}
