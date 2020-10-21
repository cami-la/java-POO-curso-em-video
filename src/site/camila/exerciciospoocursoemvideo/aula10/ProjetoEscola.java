package site.camila.exerciciospoocursoemvideo.aula10;

public class ProjetoEscola {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Aluno pessoa2 = new Aluno();
		Professor pessoa3 = new Professor();
		Funcionario pessoa4 = new Funcionario();
		
		pessoa1.setNome("Camila");
		pessoa2.setNome("Maria");
		pessoa3.setNome("Cláudio");
		pessoa4.setNome("Fabiana");
		
		pessoa1.setSexo("M");
		pessoa4.setSexo("F");
		pessoa2.setIdade(18);
		
		pessoa2.setCurso("Informática");
		pessoa3.setSalario(2500.75);
		pessoa4.setSetor("Estoque");

		//pessoa3.receberAumento(500.0);
		//pessoa2.mudarTrabalho();
		//pessoa4.cancelarMatricula();
		
		System.out.println(pessoa1.toString());
		System.out.println("----");
		System.out.println(pessoa2.toString());
		System.out.println("----");
		System.out.println(pessoa3.toString());
		System.out.println("----");
		System.out.println(pessoa4.toString());
	}

}
