import java.util.Scanner;

public class Lista1_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salarioBase, salarioLiquido, salario, imposto;
        int horasTrabalhadas;

        System.out.println("Digite seu saslário base");
        salarioBase = teclado.nextDouble();

        System.out.println("a quantidade de horas trabalhadas");
        horasTrabalhadas = teclado.nextInt();

        imposto = (salarioBase/100)*7;
        salario = imposto-(salarioBase/2);
        System.out.println(imposto);
        System.out.println(salario);
        salarioLiquido = salario*horasTrabalhadas;

        System.out.println("Seu salário líquido considerando o imposto será: "+salarioLiquido);








    }
}
