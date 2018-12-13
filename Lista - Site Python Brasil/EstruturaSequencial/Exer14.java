import java.util.Scanner;
public class Exer14{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int tamanhoEmMb, velocidade, tempo;

		tamanhoEmMb = input.nextInt();
		velocidade = input.nextInt();

		tempo = tamanhoEmMb/velocidade;

		System.out.println(tempo);

	}
}