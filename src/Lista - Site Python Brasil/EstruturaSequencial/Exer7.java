import java.util.Scanner;
public class Exer7{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double valorDeEntrada, area;

		valorDeEntrada = teclado.nextDouble();

		area = Math.pow(valorDeEntrada, 2);

		double novaArea = area*2;

		System.out.println(novaArea);
	}
}