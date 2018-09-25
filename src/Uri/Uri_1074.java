
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantidadeDeNumeros;
        quantidadeDeNumeros = input.nextInt();
        int[] numero = new int[quantidadeDeNumeros];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = input.nextInt();
        }

        for (int j = 0; j < numero.length; j++) {
            if (numero[j] == 0) {
                System.out.println("NULL");

            } else if (numero[j] % 2 == 0) {
                if (numero[j] > 0) {
                    System.out.println("EVEN POSITIVE");

                } else {
                    System.out.println("EVEN NEGATIVE");
                }

            } else if (numero[j] > 0) {
                System.out.println("ODD POSITIVE");

            } else {
                System.out.println("ODD NEGATIVE");
            }

        }

    }
}
