import java.util.Scanner;
public class Exer6{
	public static final double PI = 3.14151921;
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double area, valorParaCalcular;

		valorParaCalcular = teclado.nextDouble();

		area = PI * Math.pow(valorParaCalcular, 2);

		System.out.println(area);


	}
}