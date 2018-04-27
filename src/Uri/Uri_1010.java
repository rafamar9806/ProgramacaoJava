import java.util.Scanner;

public class Uri_1010{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);

		int codigoProduto1, codigoProduto2, quantidadeProduto1, quantidadeProduto2;
		double valorApagar, valorItem1, valorItem2;

		codigoProduto1 = teclado.nextInt();
		quantidadeProduto1 = teclado.nextInt();
		valorItem1 = teclado.nextDouble();
		valorApagar = quantidadeProduto1*valorItem1;

		codigoProduto2 = teclado.nextInt();
		quantidadeProduto2 = teclado.nextInt();
		valorItem2 = teclado.nextDouble();

		valorApagar += quantidadeProduto2*valorItem2;

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorApagar);


	}
}
