package site.camila.exerciciospoocursoemvideo.aula14;

public class Gafanhoto extends Pessoa {
	//atributos
	private String login;
	private boolean toAssistindo;
	
	//métodos
	public void viuMaisum() {
		
	}
	
	@Override
	public void ganharExeriencia() {
		if (this.toAssistindo) {
			
		}
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public boolean isToAssistindo() {
		return toAssistindo;
	}

	public void setToAssistindo(boolean toAssistindo) {
		this.toAssistindo = toAssistindo;
	}
	
	
		
}
