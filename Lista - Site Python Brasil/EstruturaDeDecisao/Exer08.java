/*
* 08 -Faça um programa que pergunte o preço de três produtos 
e informe qual produto você deve comprar,
* sabendo que a decisão é sempre pelo mais barato.
*/

import java.util.Scanner;
public class Exer08{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double [] produtos = new double [3];
		double aux;
		double produtoMaisBarato = 1000000;

		for (int i = 0;i < produtos.length ;i++ ) {
			produtos[i] = input.nextDouble();
			aux = produtos[i];

			if (produtoMaisBarato > aux) {
				produtoMaisBarato = produtos[i];
				
			}
			
		}

		System.out.println("Voce deve comprar o produto com o preco: " + produtoMaisBarato);

	}
}