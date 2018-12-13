/*
* 09 - Faça um Programa que leia três números e mostre-os em ordem decrescente.
*
*/
import java.util.Scanner;
public class Exer09{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int [] numDescrescente = new int [3];
		int aux;
		boolean controle;


		for (int i = 0;i< numDescrescente.length ;i++ ) {
			System.out.println("Digite o numero:" + " " + (i+1));
			numDescrescente[i] = input.nextInt();

			
			
		}

		for (int i = 0;i< numDescrescente.length ;i++ ) {
			controle = true;
			for (int j = 0 ;j < (numDescrescente.length - 1) ;j++ ) {
				if (numDescrescente[j] < numDescrescente[j+1]) {
					aux = numDescrescente[j];
					numDescrescente[j] = numDescrescente[j+1];
					numDescrescente[j+1] = aux;
					controle = false;

					
				}
				
			}

			if (controle) {
				break;
				
			}
			
		}
		System.out.println(" ");
		for (int i = 0;i < numDescrescente.length ;i++ ) {
			
			System.out.print(numDescrescente[i] + " ");
			
		}

		
	}
}