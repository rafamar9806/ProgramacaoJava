package exer56replit;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		String nome = input.nextLine();

		while (!nome.equals("F")) {
			String rga = input.nextLine();
			Aluno a = new Aluno(nome, rga);
			alunos.add(a);
			nome = input.nextLine();

		}

		System.out.println(alunos);

	}

}
