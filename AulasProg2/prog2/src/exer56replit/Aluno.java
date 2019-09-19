package exer56replit;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private String rga;
	
	@Override
	public String toString() {
		return String.format("{nome: %s, rga: %s}", this.nome, this.rga);
	}

	public Aluno(String nome, String rga) {
		this.nome = nome;
		this.rga = rga;
	}

	@Override
	public int compareTo(Aluno o) {

		return this.rga.compareTo(o.rga);
	}
	
	
}
