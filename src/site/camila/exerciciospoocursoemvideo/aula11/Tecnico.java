package site.camila.exerciciospoocursoemvideo.aula11;

public class Tecnico extends Aluno {
	//atributos
	private int registroProfissional;
	
	//métodos
	public void praticar() {
		System.out.println("O técnico está praticando.");
	}
	
	//métodos especiais
	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
	public int getRegitroProfissional() {
		return this.registroProfissional;
	}
}
