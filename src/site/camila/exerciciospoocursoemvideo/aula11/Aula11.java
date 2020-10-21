package site.camila.exerciciospoocursoemvideo.aula11;

public class Aula11 {

	public static void main(String[] args) {
		//Pessoa pessoa1 = new Pessoa();
		Visitante visitante1 = new Visitante();
		visitante1.setNome("Camila");
		visitante1.setIdade(26);
		visitante1.setSexo("F");
		System.out.println(visitante1.toString());
		
		System.out.println("------");
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Cláudio");
		aluno1.setMatricula(11111);
		aluno1.setCurso("Informática");
		aluno1.setIdade(16);
		aluno1.setSexo("M");
		aluno1.pagarMensalidade();		
		
		System.out.println("------");
		Bolsista bolsista1 = new Bolsista();
		bolsista1.setMatricula(11112);
		bolsista1.setNome("Case");
		bolsista1.setBolsa(12);
		bolsista1.setSexo("M");
		bolsista1.pagarMensalidade();		
		
	}

}
