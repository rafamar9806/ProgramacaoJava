import java.util.Scanner;

public class Exer8{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double salarioPorHora, horasTrabalhasNoMes, salarioMensal;

		System.out.println("Qual seu salario por hora?");
		salarioPorHora = teclado.nextDouble();

		System.out.println("Quantas horas voce trabalhou no mes?");
		horasTrabalhasNoMes = teclado.nextDouble();

		salarioMensal = salarioPorHora * horasTrabalhasNoMes;

		System.out.println("Seu salario esse mes sera de: " + salarioMensal);



	}
}