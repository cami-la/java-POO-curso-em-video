package site.camila.exerciciospoocursoemvideo.aula11;

public class Bolsista extends Aluno {
	//atributo
	private int bolsa;
	
	//método
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome() + ".");
	}
	
	//métodos especiais
	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	public int getBolsa() {
		return this.bolsa;
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista, por tanto pagamento facilitado!");		 
	}
	
}
