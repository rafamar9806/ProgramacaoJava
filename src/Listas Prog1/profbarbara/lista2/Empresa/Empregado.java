public class Empregado {
	private String nome;
	private String id;

	public Empregado() {
		this.nome = "";
		this.id = "";

	}

	public Empregado(String nome, String id) {
		this.nome = nome;
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public String getId() {
		return this.id;
	}
	public boolean equals(Empregado emp) {
		if (this.nome.equals(emp.getNome())) {
			return true;
		}
		return false;
	}

}