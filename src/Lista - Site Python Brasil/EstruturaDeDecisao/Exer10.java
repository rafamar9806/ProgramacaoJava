/*
* 10 - Faça um Programa que pergunte em que turno você estuda.
* Peça para digitar
* M-matutino ou V-Vespertino ou N- Noturno. 
*Imprima a mensagem
*"Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
*
*/

import java.util.Scanner;
public class Exer10{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String turno;
		System.out.print("Digite o turno que voce estuda\n M - matutino\t V - vespertino\t N - notuno\n");
		turno = input.nextLine();

		
		if (turno.equals("M")) {
			System.out.println("Bom Dia");
			
		}

		else if (turno.equals("V")) {
			System.out.println("Boa Tarde");
			
		}

		else if (turno.equals("N")) {
			System.out.println("Boa noite");
			
		}

		else 
			System.out.println("valor invalido");
			
		
			
	}
}