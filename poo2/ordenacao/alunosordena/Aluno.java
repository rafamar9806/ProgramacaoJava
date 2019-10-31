package alunosordena;

public class Aluno {
	// rga, nome, curso, media de aproveitamento, porcentagem cursa
	private String nome;
	private String curso;
	private String rga;
	private double mediaAproveitamento;
	private double porcentagemCursada;
	
	public Aluno(String nome, String curso, String rga, double mediaAproveitamento, double porcentagemCursada) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.rga = rga;
		this.mediaAproveitamento = mediaAproveitamento;
		this.porcentagemCursada = porcentagemCursada;
	}
	
	public Aluno() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getRga() {
		return rga;
	}

	public void setRga(String rga) {
		this.rga = rga;
	}

	public double getMediaAproveitamento() {
		return mediaAproveitamento;
	}

	public void setMediaAproveitamento(double mediaAproveitamento) {
		this.mediaAproveitamento = mediaAproveitamento;
	}

	public double getPorcentagemCursada() {
		return porcentagemCursada;
	}

	public void setPorcentagemCursada(double porcentagemCursada) {
		this.porcentagemCursada = porcentagemCursada;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", curso=" + curso + ", rga=" + rga + ", mediaAproveitamento="
				+ mediaAproveitamento + ", porcentagemCursada=" + porcentagemCursada + "]";
	}
	
	public int compareTo(Aluno n) {
		if (this.nome.compareTo(n.nome)>0) {
			return 1;
		}
		
		return 0;
		
	}
	
	
	
	
}
