package exer58replit;

public class Aluno implements Comparable<Aluno> {
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

	public String getNome() {
		return nome;
	}

	public String getRga() {
		return rga;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rga == null) {
			if (other.rga != null)
				return false;
		} else if (!rga.equals(other.rga))
			return false;
		return true;
	}

}
