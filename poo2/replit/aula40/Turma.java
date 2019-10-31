package aula40;

public class Turma {
	private int quantidade;
	private String disciplina;

	public Turma(int quantidade, String disciplina) {
		super();
		this.quantidade = quantidade;
		this.disciplina = disciplina;
	}

	public Turma() {

	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Turma [quantidade=" + quantidade + ", disciplina=" + disciplina + "]";
	}

	public int compareTo(Turma turma) {
		if (this.disciplina.equals(turma.getDisciplina())) {
			return comparaQtd(turma);
		} else if (this.disciplina.compareTo(turma.getDisciplina()) < 0) {
			return -1;
		} else {
			return 1;
		}
	}

	private int comparaQtd(Turma turma) {
		if (this.quantidade == turma.quantidade) {
			return 0;
		} else if (this.quantidade > turma.quantidade) {
			return 1;
		}else {
			return -1;
		}
	}

	

}
