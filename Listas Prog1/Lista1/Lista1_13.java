package Lista1;

import java.util.Scanner;

public class Lista1_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int anoNascimento, anoAtual, anoDaquiCinquentaAnos, idade;

        System.out.println("Digite o ano do seu nascimento");
        anoNascimento = teclado.nextInt();

        System.out.println("Digite o ano atual");
        anoAtual = teclado.nextInt();

        idade = anoAtual-anoNascimento;
        anoDaquiCinquentaAnos = idade+50;

        System.out.println("Voce tem "+idade+" "+"Anos de idade");
        System.out.println("Daqui 50 anos voce terá: "+anoDaquiCinquentaAnos+" "+"Anos de Idade");
    }
}
