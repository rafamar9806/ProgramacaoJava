import java.util.Scanner;

public class Uri_1041 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float eixoX, eixoY;

        eixoX = teclado.nextFloat();
        eixoY = teclado.nextFloat();

        if (eixoX == 0.0 && eixoY == 0.0) {
            System.out.printf("Origem\n");
        } else if (eixoX == 0.0) {
            System.out.printf("Eixo Y\n");
        } else if (eixoY == 0.0) {
            System.out.printf("Eixo X\n");
        } else if (eixoX > 0 && eixoY > 0) {
            System.out.printf("Q1\n");
        } else if (eixoX < 0 && eixoY > 0) {
            System.out.printf("Q2\n");
        } else if (eixoX > 0 && eixoY < 0) {
            System.out.printf("Q4\n");
        } else {
            System.out.printf("Q3\n");
        }

    }
}
