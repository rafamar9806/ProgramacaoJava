import java.util.Scanner;

//Fa̧ca um algoritmo que receba quatro números, calcule e mostre a soma destes números.

public class Lista1_1 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int primeiroNumero, segundoNumero, terceiroNumero, quartoNumero;
        System.out.println("Digite o Primeiro Numero");
        primeiroNumero = teclado.nextInt();
        System.out.println("Digite o Segundo Numero");
        segundoNumero = teclado.nextInt();
        System.out.println("Digite o Terceiro Numero");
        terceiroNumero = teclado.nextInt();
        System.out.println("Digite o Quarto Numero");
        quartoNumero = teclado.nextInt();

        int soma = primeiroNumero+segundoNumero+terceiroNumero+quartoNumero;

        System.out.println("A soma desses quatro numeros é\n" +soma);

    }
}
