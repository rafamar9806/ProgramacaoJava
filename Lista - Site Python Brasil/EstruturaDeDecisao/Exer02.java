/*
* 2 - Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
*
*/
import java.util.Scanner;
public class Exer02{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1;

		System.out.println("Digite o numero desejado");
		num1 = input.nextInt();

		System.out.println(num1 < 0 ? "eh um  numero negativo": "eh um numero positivo");
	}
}		