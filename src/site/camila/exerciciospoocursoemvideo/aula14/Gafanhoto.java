package site.camila.exerciciospoocursoemvideo.aula14;

public class Gafanhoto extends Pessoa {
	//atributos
	private String login;
	private int toAssistindo;
		
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.setLogin(login);
		this.setToAssistindo(0);
	}	
	
	//métodos
	public void viuMaisum() {
		
	}
	
	@Override
	public void ganharExeriencia() {
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getToAssistindo() {
		return toAssistindo;
	}

	public void setToAssistindo(int toAssistindo) {
		this.toAssistindo = toAssistindo;
	}

	@Override
	public String toString() {
		return "Gafanhoto " + super.toString() + "\n[login=" + login + ", toAssistindo=" + toAssistindo + "]";
	}
	
	
	
		
}
