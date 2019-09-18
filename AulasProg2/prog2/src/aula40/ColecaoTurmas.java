package aula40;

public class ColecaoTurmas {
	Turma[] turmas;
	private int quantidade;

	public ColecaoTurmas() {
		this.quantidade = 0;
		turmas = new Turma[100];
	}

	public ColecaoTurmas(int n) {
		this.quantidade = 0;
		turmas = new Turma[n];

	}
	
	public void selectionSort() {
		for (int i = 0; i < quantidade; i++) {
			int menor = i;
			for (int j = i+1; j < quantidade; j++) {
				if (turmas[j].compareTo(turmas[menor])<0) {
					menor = j;
				}
			}
			
			troca(menor,i);
			
		}
	}

	private void troca(int menor, int i) {
		Turma aux = new Turma();
		aux = turmas[i];
		turmas[i] = turmas[menor];
		turmas[menor] = aux;
		
		
	}

	public void adicionarTurma(Turma turma) {
		turmas[quantidade] = turma;
		this.quantidade++;

	}
	
	public String toString() {
		String str = "";
		for (Turma turma : turmas) {
			str += turma + "\n";
		}
		return str;
	}

}
