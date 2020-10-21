package site.camila.exerciciospoocursoemvideo.aula08;
import java.util.Random;

import site.camila.exerciciospoocursoemvideo.aula07.Lutador;

public class Luta {
	//atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	
	//métodos especiais
	/*public Luta() {
		this.setDesafiado(desafiado);
		this.setDesafiante(desafiante);
		this.setAprovada(false);
		
	}*/
	
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	public Lutador getDesafiado() {
		return this.desafiado;
	}
		
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public int getRounds() {
		return this.rounds;
	}
	
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	public boolean getAprovada() {
		return this.aprovada;
	}


	public void marcarLuta(Lutador lutador1, Lutador lutador2) {
		if (lutador1 != lutador2 && lutador1.getCategoria().contentEquals(lutador2.getCategoria())) {
			this.setAprovada(true);
			this.setDesafiado(lutador1);
			this.setDesafiante(lutador2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(lutador1);
			this.setDesafiante(lutador2);
		}
		
	}

	public void lutar() {
		if (this.getAprovada()) {	

			this.getDesafiado().apresentar();

			this.getDesafiante().apresentar();
			
			Random gerador = new Random();
			
			int vencedor = gerador.nextInt(3);
			
			switch(vencedor){
				case 0: 
					System.out.println("Empate!"); 
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					break;
				case 1: System.out.println("Ganhou o DESAFIADO! " + this.getDesafiado().getNome()); 
					desafiado.ganharLuta();
					desafiante.perderLuta();
					break;
				case 2: System.out.println("Ganhou o DESAFIANTE! " + this.getDesafiante().getNome());
					desafiado.perderLuta();
					desafiante.ganharLuta();
					break;
			}		
			
			System.out.println("====================");
		} else {
			System.out.println("A luta não pode acontecer!");
		}
		
	}

}
