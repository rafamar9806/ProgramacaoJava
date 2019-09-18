package alunosordena;

public class Main {
	public static void main(String [] args) {
		ColecaoAlunos alunos = new ColecaoAlunos();
		
		Aluno aluno1 = new Aluno("Rafael", "SI", "2018", 10, 40);
		Aluno aluno2 = new Aluno("Antonio", "SI", "2018", 10, 40);
		Aluno aluno3 = new Aluno("xuxa", "SI", "2018", 10, 40);
		Aluno aluno4 = new Aluno("maria", "SI", "2018", 10, 40);

		
		alunos.adicionarAluno(aluno1);
		alunos.adicionarAluno(aluno2);
		alunos.adicionarAluno(aluno3);
		alunos.adicionarAluno(aluno4);


		System.out.println(alunos);
		
		
		
	}
}
