import java.util.Scanner;
public class Exer10{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double farenheith, celsius;

		celsius = teclado.nextDouble();

		farenheith =  ((celsius * 9)/5)+32;

		System.out.println(farenheith); 
	}
}