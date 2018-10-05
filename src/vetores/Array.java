import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);



		System.out.println("Entre com a quantidade de numeros do vetor");
		int quantidadeNumeros = input.nextInt();
		int  [] numeros  = new int[quantidadeNumeros];

		for (int k = 0;k < numeros.length ;k++ ) {
			numeros[k] = input.nextInt();
			
		}

		Arrays.sort(numeros);

		int [] novoVetor = new int[numeros.length];

		for (int i = 0 ;i < numeros.length ;i++ ) {
			for (int j = i;j < novoVetor.length ;j++ ) {
				novoVetor[j] = numeros[i];
				
			}
				
			
			  
			
		}
		for (int veta :novoVetor ) {
			System.out.print(veta + " ");
			
		}
		
	}
}