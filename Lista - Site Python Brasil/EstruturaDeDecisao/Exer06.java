/*
*06 - Faça um Programa que leia três números e mostre o maior deles.
*
*/
import java.util.Scanner;

public class Exer06{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int [] numeros = new int [3];
		int maior = 0;
		int aux = 0;

		for (int i = 0; i< numeros.length ;i++ ) {
			System.out.println("Digite o valor do numero " + (i+1));
			numeros[i] = input.nextInt();
			aux = numeros[i];

			if (maior < aux) {
				maior = numeros[i];
			
			
			}
			
		}
		System.out.printf("%d eh o maior ", maior);

		
	}	
}					
