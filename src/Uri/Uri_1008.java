import java.util.Scanner;

public class Uri_1008 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int numeroFuncionario, horasTrabalhadas;
        float valorHora;

        System.out.print("Digite o número do funcionario\n");
        numeroFuncionario = teclado.nextInt();
        System.out.print("Digite a quantidade de horas trabalhadas\n");
        horasTrabalhadas = teclado.nextInt();
        valorHora = teclado.nextFloat();

        float salario = valorHora*horasTrabalhadas;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
