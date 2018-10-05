import java.util.Scanner;
public class Exer5{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int metros, conversao;

		metros = teclado.nextInt();

		conversao = metros * 100;

		System.out.println(conversao);
	}
}
