/*
* 1 - Faça um Programa que peça dois números e imprima o maior deles.
*
*/
import java.util.Scanner;
public class Exer01{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2;

		System.out.println("Digite o Primeiro numero");
		num1 = input.nextInt();

		System.out.println("Digite o Segundo numero");
		num2 = input.nextInt();

		if (num1 > num2) {
			System.out.printf("%d eh maior que %d " , num1, num2);
			
		}

		if (num2 > num1) {
			System.out.printf("%d eh maior que %d \n" , num2, num1);
			
		}

		else
			System.out.println(" Numeros iguais");
			
		


	}
}
