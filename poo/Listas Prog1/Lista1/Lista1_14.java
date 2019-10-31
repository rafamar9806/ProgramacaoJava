package Lista1;

import java.util.Scanner;

public class Lista1_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salarioBase, salarioLiquido, salario, imposto, resultado;
        int horasTrabalhadas;

        System.out.println("Digite seu saslário base");
        salarioBase = teclado.nextDouble();

        System.out.println("a quantidade de horas trabalhadas");
        horasTrabalhadas = teclado.nextInt();

        salario = (salarioBase/2); //Recebe o sálario base e divide por 2
        resultado = (salario*7)/100; // Calcula 7% sob o salario base recebido
        imposto = salario-resultado; // desconta 7% sob o salario base
        
        salarioLiquido = (imposto*horasTrabalhadas); //multiplica o novo salario base por a quantidade de horas trabalhadas

        System.out.println("Seu salário líquido considerando o imposto será: "+salarioLiquido); //imprime o salario liquido com os descontos
        

    }
}
