/*
*5 - Faça um programa para a leitura de duas notas parciais de um aluno. 
O programa deve calcular a média alcançada por aluno e apresentar:

*A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;

*A mensagem "Reprovado", se a média for menor do que sete;

*A mensagem "Aprovado com Distinção", se a média for igual a dez.
*
*/

import java.util.Scanner;

public class Exer05{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double nota1, nota2;
		double media = 0.0;

		nota1 = input.nextDouble();
		nota2 = input.nextDouble();

		media = (nota1+nota2)/2;

		if (media >= 7.0 && media < 10.0) {
			System.out.println("Aprovado");
			
		}

		else if (media < 7.0) {
			System.out.println("Reprovado");
			
		}

		else if (media == 10.0) {
			System.out.println("Aprovado com Distinção");
			
		}
	}
}