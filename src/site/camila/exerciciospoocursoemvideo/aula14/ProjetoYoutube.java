package site.camila.exerciciospoocursoemvideo.aula14;

public class ProjetoYoutube {

	public static void main(String[] args) {
		Video[] video = new Video[3];
		video[0] = new Video("Aula 1 de POO");
		video[1] = new Video("Aula 12 de PHP");
		video[2] = new Video("Aula 10 de HTML5");
		
		System.out.println(video[0].toString());
		
		Gafanhoto[] gafanhoto = new Gafanhoto[2];
		gafanhoto[0] = new Gafanhoto("camila", 26, "F", "cami-la");
		gafanhoto[1] = new Gafanhoto("case", 29, "M", "case");
		
		System.out.println(gafanhoto[0].toString());
		
		Visualizacao visualizacao = new Visualizacao(gafanhoto[0], video[0]);
		visualizacao.avaliar(5);
		Visualizacao visualizacao2 = new Visualizacao(gafanhoto[1], video[0]);
		Visualizacao visualizacao3 = new Visualizacao(gafanhoto[0], video[1]);

		System.out.println("--------");
		System.out.println(visualizacao.toString());
		System.out.println(visualizacao2.toString());
		System.out.println(visualizacao3.toString());


	}

}
