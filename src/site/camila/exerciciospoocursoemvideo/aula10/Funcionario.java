package site.camila.exerciciospoocursoemvideo.aula10;

public class Funcionario extends Pessoa {
	//atributos
	private String setor;
	private boolean trabalhando;
	

	//métodos
	public void mudarTrabalho() {
		this.trabalhando = !this.getTrabalhando();
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String getSetor() {
		return this.setor;
	}
	
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	public boolean getTrabalhando() {
		return this.trabalhando;
	}
	
}
