package site.camila.exerciciospoocursoemvideo.aula07;

import site.camila.exerciciospoocursoemvideo.aula08.Luta;

public class Aula07 {
	public static void main(String[] args) {
		Lutador[] lutadores = new Lutador[6];
		
		lutadores[0] = new Lutador("Prety Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		
		lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		
		lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		
		lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);

		lutadores[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);

		lutadores[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		Luta UEC01 = new Luta(); 
	
		UEC01.marcarLuta(lutadores[0], lutadores[5]);
		UEC01.lutar();
		
		/*
		System.out.println();
		lutadores[0].status();
		System.out.println();
		lutadores[1].status();
		*/
	}
}
