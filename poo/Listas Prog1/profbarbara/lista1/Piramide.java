import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, Digite a quantidade de linhas");
        int linhas = input.nextInt();

        for (int i = 0; i <= linhas; i++) {
            for (int j = 0; j <= linhas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
