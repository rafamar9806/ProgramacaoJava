public class EstudanteTeste{
	public static void main(String[] args) {
		Estudante aluno1 = new Estudante("Rafael", 36);
		Estudante aluno2 = new Estudante("Maria", 38);

		aluno1.adicionaNota(5.5, 0);
		aluno2.adicionaNota(9.5, 0);

		aluno1.adicionaNota(1.5, 1);
		aluno2.adicionaNota(9.5, 1);

		aluno1.adicionaNota(10.0, 4);
		

		aluno1.imprimeNota();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
		aluno2.imprimeNota();

		System.out.println("=-=-=-");
		



		System.out.println(aluno1.igualnota(aluno2, 0));
		System.out.println(aluno1.igualnota(aluno2, 1));
		System.out.println(aluno1.igualnota(aluno2, 2));
		System.out.println(aluno1.igualnota(aluno2, 3));
		System.out.println(aluno1.igualnota(aluno2, 4));
		System.out.println(aluno1.igualnota(aluno2, 5));
		
		System.out.println("=-=-=-==-=-=-=-=-=-");
		System.out.println("Maior nota do aluno1: "+aluno1.getMaiorNota());

	}
}