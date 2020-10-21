package site.camila.exerciciospoocursoemvideo.aula05;

public class ContaBanco {
	//atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
		

	//métodos Personalisados
	public void statusAtual() {
		System.out.println("---------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo da Conta: " + this.getTipo());
		System.out.println("Titular: " + this.getDono());
		System.out.println("Saldo da Conta: R$" + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if (t.equalsIgnoreCase("CP")) {
			this.setSaldo(150);
		} else if (t.equalsIgnoreCase("CC")) {
			this.setSaldo(50);
		}
		
		System.out.println("Conta aberta com sucesso!");
	}


	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro: R$" + this.getSaldo() + ". Logo, não pode ser encerrada!");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em débito: -R$" + this.getSaldo());
		} else {
			this.setStatus(false);
			System.out.println("Conta encerrada!");
		}		
		
	}
	

	public void depositar(double value) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + value);
			System.out.println("Déposito realizado na conta de: " + this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}		
	}

	public void sacar(double value) {
		if (this.getStatus()) {
			if (this.getSaldo() >= value) {
				this.setSaldo(this.getSaldo() - value);
				System.out.println("Saque realizado com sucesso!");
			} else {
				System.out.println("Saldo inuficiente para saque: -R$" + (value - this.getSaldo()));
			}
		} else {
			System.out.println("Conta Inexistente!");
		}
	}

	public void pagarMensal() {
		int taxa = 0;
		if (this.getTipo().equalsIgnoreCase("CC")) {
			taxa = 12;
		} else if (this.getTipo().equalsIgnoreCase("CP")) {
			taxa = 20;
		}
		
		if (getStatus()) {
			this.setSaldo(this.getSaldo() - taxa);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossível pagar uma conta fechada!");
		}
		
	}
	
	//métodos especiais
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);		
	}
	
	public void setNumconta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	}