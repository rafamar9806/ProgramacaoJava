import java.util.Scanner;

public class Lista1_9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float salariobruto, salarioLiquido;
        System.out.println("Digite seu salario bruto: ");
        salariobruto = teclado.nextFloat();

        salarioLiquido = (salariobruto/100*2);
        salarioLiquido = salariobruto-salarioLiquido;

        System.out.println("Novo salario é:\n"+salarioLiquido);
    }
}
