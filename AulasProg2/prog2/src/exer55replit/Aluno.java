package exer55replit;

import java.util.Scanner;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private String rga;

	public Aluno(String nome, String rga) {
		this.nome = nome;
		this.rga = rga;
	}

	public boolean equals(Aluno obj) {
		if (this.rga.equals(obj.getRga()))
			return true;

		return false;
	}

	@Override
	public String toString() {
		return String.format("{nome: %s, rga: %s}", this.nome, this.rga);
	}

	public String getNome() {
		return nome;
	}

	public String getRga() {
		return rga;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Aluno a1 = new Aluno(input.nextLine(), input.nextLine());
		
		System.out.println(a1);


	}

	@Override
	public int compareTo(Aluno o) {
		if (this.rga.compareTo(o.getRga())==0) {
			return 0;
		}
		return 1;
	}

}
