import java.util.Scanner;
public class Exer12{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double pesoIdeal, altura;

		altura = teclado.nextDouble();

		pesoIdeal = (72.7*altura) - 58;

		System.out.println("O peso ideal eh: " + pesoIdeal);
	}
}