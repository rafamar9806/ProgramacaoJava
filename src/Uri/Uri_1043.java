import java.util.Scanner;

public class Uri_1043{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float ladoA, ladoB, ladoC, soma, diferenca, perimetro, trapezioArea;

		ladoA = teclado.nextFloat();
		ladoB = teclado.nextFloat();
		ladoC = teclado.nextFloat();

		diferenca = ladoB-ladoC;
		soma = ladoB+ladoC;

		if (ladoA > diferenca && ladoA < soma) {
			perimetro = ladoA+ladoB+ladoC;
			System.out.printf("Perimetro = %.1f\n", perimetro);
			
		}
		else{
			trapezioArea = (ladoA+ladoB)/2*2;
			System.out.printf("Area = %.1f\n", trapezioArea);

		}
	}
}