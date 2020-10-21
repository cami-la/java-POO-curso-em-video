package site.camila.exerciciospoocursoemvideo.aula12;

public class Aula12 {
	public static void main(String[] args) {
		//Animal animal = new Animal();
		Mamifero mamifero = new Mamifero();
		mamifero.setCorPelo("Marrom");
		mamifero.setPeso(85.3);
		mamifero.setIdade(2);
		mamifero.setMembros(4);
		mamifero.alimentar();
		mamifero.emitirSom();
		mamifero.locomover();
		
		Reptil reptil = new Reptil();
		reptil.setPeso(0.35);
		reptil.setIdade(1);
		reptil.setMembros(0);
		reptil.locomover();
		reptil.alimentar();
		reptil.emitirSom();
		
		System.out.println("----------");
		Peixe peixe = new Peixe();
		peixe.setPeso(0.35);
		peixe.setIdade(1);
		peixe.setMembros(0);
		peixe.locomover();
		peixe.alimentar();
		peixe.emitirSom();
		peixe.soltarBolha();
		
		System.out.println("----------");
		Ave ave = new Ave();
		ave.setPeso(0.89);
		ave.setIdade(2);
		ave.setMembros(2);
		ave.locomover();
		ave.alimentar();
		ave.emitirSom();
		ave.fazerNinho();
		
		System.out.println("----------");
		Mamifero mamifero2 = new Mamifero();
		mamifero2.setPeso(5.7);
		mamifero2.setIdade(8);
		mamifero2.setMembros(4);
		mamifero2.alimentar();
		mamifero2.emitirSom();
		mamifero2.locomover();
		
		System.out.println("----------");
		Canguru canguru = new Canguru();
		canguru.setPeso(55.3);
		canguru.setIdade(3);
		canguru.setMembros(4);
		canguru.alimentar();
		canguru.emitirSom();
		canguru.locomover();
		canguru.usarBolsa();
		
		System.out.println("----------");
		Cachorro cachorro = new Cachorro();
		cachorro.setPeso(3.94);
		cachorro.setIdade(5);
		cachorro.setMembros(4);
		cachorro.alimentar();
		cachorro.emitirSom();
		cachorro.locomover();
		cachorro.abanarRabo();
		
		
	}
}
