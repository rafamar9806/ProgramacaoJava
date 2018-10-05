import java.util.Scanner;
public class Exer11{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num1, num2;
		double numReal;

		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		numReal = teclado.nextDouble();

		int a = (num2/2) * (num1*2);
		double b = (num1*3) + numReal;
		double c = Math.pow(numReal, 3);

		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);



	}
}