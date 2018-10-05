import java.util.Scanner;
public class Exer9{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double farenheith, celsius;

		farenheith = teclado.nextDouble();

		celsius = (5 * (farenheith - 32) / 9);

		System.out.println(celsius); 
	}
}