/*
*4 - Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
*
*
*/

import java.util.Scanner;

public class Exer04{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String letraParaVerificar = input.nextLine();

		String [] vogais = {"a","e","i","o","u"};
		String [] consoantes = {"b","c","d",
		"f","g","h","j","k","l","m","n","p","q","r","s","t","v","x","w","y","z"};

		for (int i = 0; i < vogais.length ;i++ ) {
			if (vogais[i].equals(letraParaVerificar)) {
				System.out.println("eh vogal");
				
			}
			
			

			}
			for (int j = 0;j < consoantes.length ;j++ ) {
				if (consoantes[j].equals(letraParaVerificar)) {
					System.out.println("eh consoante");
				
				}
		
			
		}

	}
}