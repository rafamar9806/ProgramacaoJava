import java.util.Scanner;

public class Uri_1154{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double idades, somaIdades = 0, totalDePessoas = 0;
		double mediaIdades = 0.0;
		idades = input.nextInt();

		while (idades >= 0) {
			somaIdades += idades;
			totalDePessoas++;
			idades = input.nextDouble();
		}
		mediaIdades = somaIdades / totalDePessoas;
		System.out.printf("%.2f\n" , mediaIdades);
	}
}