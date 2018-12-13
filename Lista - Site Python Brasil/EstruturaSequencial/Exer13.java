import java.util.Scanner;

public class Exer13{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double salarioPorHora, horasTrabalhasNoMes, salarioMensal;
		double impostoDeRenda, inss, sindicato;

		System.out.println("Qual seu salario por hora?");
		salarioPorHora = teclado.nextDouble();

		System.out.println("Quantas horas voce trabalhou no mes?");
		horasTrabalhasNoMes = teclado.nextDouble();

		salarioMensal = salarioPorHora * horasTrabalhasNoMes;

		impostoDeRenda =  (salarioMensal/100)*11;
		inss = (salarioMensal/100)*8;
		sindicato = (salarioMensal/100)*5;

		double descontos = impostoDeRenda + inss + sindicato;
		double salarioLiquido = salarioMensal - descontos;


		System.out.println("Salario Bruto " + salarioMensal);
		System.out.println("descontos " + salarioLiquido);





	}
}