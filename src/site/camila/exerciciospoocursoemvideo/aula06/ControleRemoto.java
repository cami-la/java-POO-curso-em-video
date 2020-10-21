package site.camila.exerciciospoocursoemvideo.aula06;

public class ControleRemoto implements Controlador {
	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//metodos especiais
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(true);
	}
	
	private void setVolume(int volume) {
		this.volume = volume;
	}
	
	private int getVolume() {
		return this.volume;
	}
	
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	private boolean isLigado() {
		return this.ligado;
	}
	
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	private boolean isTocando() {
		return this.tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if (this.isLigado()) {
			System.out.println("----- MENU -----");
			System.out.println("Abrindo menu...");
			System.out.println("Está tocando? " + this.isTocando());
			/*if (isTocando()) {
				System.out.println(this.isTocando());
			} else {
				System.out.println("false");
			}*/
			System.out.print("Volume: " + getVolume() + " ");
			for (int i = 0; i < this.getVolume(); i+=10) {
				System.out.print("|");
			}
			System.out.println();
		} 
	}

	@Override
	public void fecharMenu() {
		if (this.isLigado()) {
			System.out.println("Fechando o meunu...");
		}
	}

	@Override
	public void maisVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() + 1);
		}
	}

	@Override
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() - 1);
		} else if (this.getVolume() == 0) {
			System.out.println("O volume já está no mínimo!");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
			this.setTocando(false);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.isLigado() && this.getVolume() == 0) {
			this.setTocando(true);
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if (this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}
	}
	
}
