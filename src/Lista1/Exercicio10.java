import java.util.Scanner;

public class Lista1_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float valorAplicado, taxaJuros, valorFinal;

        System.out.println("Digite o capital inicial");
        valorAplicado = teclado.nextFloat();

        System.out.println("Digite a taxa de juros");
        taxaJuros = teclado.nextFloat();

        valorFinal = valorAplicado * (1+taxaJuros)*(1+taxaJuros);
        System.out.printf("valor final é: R$%.2f\n" , valorFinal);
    }
}
