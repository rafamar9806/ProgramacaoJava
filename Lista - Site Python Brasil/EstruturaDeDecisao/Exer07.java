/*
*07 - Faça um Programa que leia três números e mostre o maior e o menor deles.
*
*/
import java.util.Scanner;

public class Exer07{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int [] numeros = new int [3];
		int maior = 0;
		int menor = 1000000;
		int aux = 0;

		for (int i = 0; i< numeros.length ;i++ ) {
			System.out.println("Digite o valor do numero " + (i+1));
			numeros[i] = input.nextInt();
			aux = numeros[i];

			if (maior < aux) {
				maior = numeros[i];
			
			
			}

			if (menor > aux){
			menor = numeros[i]; 
				
			}
			
		}
		System.out.printf("%d eh o maior ", maior);
		System.out.printf("%d eh o menor ", menor);

		
	}	
}					
