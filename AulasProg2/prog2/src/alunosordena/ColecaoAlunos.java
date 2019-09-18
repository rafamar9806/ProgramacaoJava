package alunosordena;

import java.util.Arrays;

public class ColecaoAlunos {
	Aluno [] alunos;
	private int quantidadeAlunos;
	
	public ColecaoAlunos() {
		this.alunos = new Aluno[100];
		quantidadeAlunos = 0;
	}
	
	public boolean adicionarAluno(Aluno alu) {
		if (quantidadeAlunos>=alunos.length) 
			return false;
		alunos[quantidadeAlunos] = alu;		
		quantidadeAlunos++;
		return true;
		
	}
	
	public void ordenar() {
		for (int i = 0; i < this.quantidadeAlunos; i++) {
			for (int j = 0; j < this.quantidadeAlunos; j++) {
				if (alunos[j].compareTo(alunos[j+1])>0) {
					troca(j, j+1);
				}
			}
		}
	}
	
	public void troca(int i, int j) {
		Aluno alunoaux = new Aluno();
		alunoaux = alunos[i];
		alunos[i] = alunos[j];
		alunos[j] = alunoaux;
				
	}

	public String toString() {
		  String str = "";
		   for (int i = 0; i < this.quantidadeAlunos; i ++) {
		      str += alunos[i] + "\n";
		    }
		    	return str;
	}
	  
	  
	
	
	
	
	
}
