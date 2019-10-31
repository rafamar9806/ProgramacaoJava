package aula40;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantidadeTurmas = input.nextInt();
		input.nextLine();
		ColecaoTurmas colecaoTurmas = new ColecaoTurmas(quantidadeTurmas);

		for (int i = 0; i < quantidadeTurmas; i++) {
			String disciplina = input.nextLine();
			int quantidadeAlunos = input.nextInt();
			input.nextLine();
			Turma turma = new Turma(quantidadeAlunos, disciplina);
			colecaoTurmas.adicionarTurma(turma);
		}
		colecaoTurmas.selectionSort();
		System.out.println(colecaoTurmas);
	}

}
