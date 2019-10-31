public class AlternativaCorreta{

	private static char [] corretas = {'a', 'a', 'e', 'c', 'b', 'd', 'e', 'a', 'c', 'e',
		'b', 'a', 'd', 'c', 'd', 'e', 'a', 'd', 'b', 'c'};

	public static void main(String[] args) {
		char [] aluno1 = {'b','a','c','c','d','d','d','a','b','a','b','e',
		'e','a','d','a','b','c','d','e'};

		char [] aluno2 = {'e','e','e','e','e','e','e','e','e','e','e','e',
		'e','e','e','e','e','e','e','e'};

		int respostasAluno1 = numAcertos(aluno1);
		System.out.println(respostasAluno1);

		int respostasAluno2 = numAcertos(aluno2);
		System.out.println(respostasAluno2);
	}

	public static int numAcertos(char [] respostas){
		int numAcertos = 0;
		for (int i = 0;i < corretas.length ;i++ ) {
			if (corretas[i]==respostas[i]) {
				numAcertos++;
				
				
		}
	}
		
		return numAcertos;
	}

	
}	
