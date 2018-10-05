/*
*3 - Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever:
 F - Feminino,
 M - Masculino,
 Sexo Inválido.
*
**/

import java.util.Scanner;

public class Exer03{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String letraGenero;

		System.out.println("Digite M para Masculino, F para Feminino");
		letraGenero = teclado.nextLine();

		switch (letraGenero){
			case "M" :
				System.out.println("Masculino");
				break;
			case "F" :
				System.out.println("Feminino");
				break;
			default:
				System.out.println("Invalido");	

		}
	}
}
