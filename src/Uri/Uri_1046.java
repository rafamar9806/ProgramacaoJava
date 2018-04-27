import java.util.Scanner;

public class Uri_1046{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int horaFinal, horaInicial, diferenca;

		horaInicial = teclado.nextInt();
		horaFinal = teclado.nextInt();

		diferenca = horaFinal-horaInicial;

		if (horaFinal == horaFinal) {
			System.out.printf("O JOGO DUROU 24 HORA(S)");
			
		}
		else if (horaInicial>horaFinal) {
			diferenca += 24;
			System.out.printf("O JOGO DUROU %d HORA(S)", diferenca);

		}
		else if (horaInicial<horaFinal) {
			System.out.printf("O JOGO DUROU %d HORA(S)", diferenca);
			
		}
		
	}
}