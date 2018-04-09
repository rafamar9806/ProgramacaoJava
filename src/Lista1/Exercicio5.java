import java.util.Scanner;

public class Lista1_5 {
    public static void main(String [] args){
        Scanner tecalado = new Scanner(System.in);
        double salario, percentualAumento;
        System.out.println("Digite seu salario:");
        salario = tecalado.nextDouble();
        System.out.println("Digite a porcentagem de aumento:");
        percentualAumento = tecalado.nextDouble();

        double novoSalario = (salario/100*percentualAumento)+salario;
        System.out.println("Novo salario é: \n" +novoSalario);

    }

}
