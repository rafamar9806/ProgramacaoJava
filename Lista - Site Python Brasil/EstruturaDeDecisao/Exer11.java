/*
* 11 -As Organizações Tabajara resolveram dar um aumento
 de salário aos seus colaboradores e lhe contraram 
 para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador
 e o reajuste segundo o seguinte critério, baseado no salário atual:

*salários até R$ 280,00 (incluindo) : aumento de 20%
*salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
*salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
*salários de R$ 1500,00 em diante : aumento de 5% 
Após o aumento ser realizado, informe na tela:
*o salário antes do reajuste;
*o percentual de aumento aplicado;
*o valor do aumento;
*o novo salário, após o aumento.

*/

import java.util.Scanner;
public class Exer11{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double salario, salarioReajustado = 0.0;
		System.out.println("Digite ser salario atual");
		salario = input.nextDouble();

		System.out.println(" ");
		if (salario <= 280.0) { //+ 20%
			salarioReajustado = (salario/100)*20;
			double aumento = (salario/100)*20;
			salarioReajustado += salario;
			System.out.println("salario antes do reajuste: " + salario);
			System.out.println("20% de aumento " );
			System.out.println("valor do aumento: " + aumento);
			System.out.println(" novo salario, apos o aumento: " + salarioReajustado);

			
		}

		if (salario > 280.0 && salario <= 700.0) { //+ 15%
			salarioReajustado = (salario/100)*15;
			double aumento = (salario/100)*15;
			salarioReajustado += salario;
			System.out.println("salario antes do reajuste: " + salario);
			System.out.println("15% de aumento " );
			System.out.println("valor do aumento: " + aumento);
			System.out.println(" novo salario, apos o aumento: " + salarioReajustado);

		}
		if (salario > 700.0 && salario <= 1500.0) { //+ 10%
			salarioReajustado = (salario/100)*10;
			double aumento = (salario/100)*10;
			salarioReajustado += salario;
			System.out.println("salario antes do reajuste: " + salario);
			System.out.println("10% de aumento " );
			System.out.println("valor do aumento: " + aumento);
			System.out.println(" novo salario, apos o aumento: " + salarioReajustado);
		
		}

		if (salario >1500.0) { //+ 15%
			salarioReajustado = (salario/100)*5;
			double aumento = (salario/100)*5;
			salarioReajustado += salario;
			System.out.println("salario antes do reajuste: " + salario);
			System.out.println("5% de aumento " );
			System.out.println("valor do aumento: " + aumento);
			System.out.println(" novo salario, apos o aumento: " + salarioReajustado);

			
		}

	}
}