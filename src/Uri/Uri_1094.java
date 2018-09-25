import java.util.Scanner;

public class Uri_1094{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int quantidadeEntradas;
		quantidadeEntradas = input.nextInt();
		int dadosProcessados = 0;
		int quantidadeSapo = 0;
		int quantidadeCoelho = 0;
		int quantidadeRato = 0;
		int quantidadeAnimais = 0;
		int quantidadeTotal = 0;

		char tipoDeAnimal;
		while (dadosProcessados < quantidadeEntradas) {
			input.nextLine();
			quantidadeAnimais = input.nextInt();

			tipoDeAnimal = input.next().charAt(0);

			if (tipoDeAnimal == 'R') {
				quantidadeRato+= quantidadeAnimais;
			}
			else if (tipoDeAnimal == 'C') {
				quantidadeCoelho+=quantidadeAnimais;
			}
			else if (tipoDeAnimal == 'S') {
				quantidadeSapo+=quantidadeAnimais;
				
			}
			quantidadeTotal += quantidadeAnimais;
			dadosProcessados++;
		}
		float total_C_parcent = (float)((quantidadeCoelho * 100.00) /quantidadeTotal);
		float total_R_parcent = (float)((quantidadeRato * 100.00) /quantidadeTotal);
		float total_S_parcent = (float)((quantidadeSapo * 100.00) /quantidadeTotal);

		System.out.printf("Total: %d cobaias\n" , quantidadeTotal);
		System.out.println("Total de coelhos: " + quantidadeCoelho);
		System.out.println("Total de ratos: " + quantidadeRato);
		System.out.println("Total de sapos: " + quantidadeSapo);

		System.out.printf("Percentual de coelhos: %.2f",total_C_parcent);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f",total_R_parcent);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f",total_S_parcent);
		System.out.print(" %\n");

		
 

	}
}