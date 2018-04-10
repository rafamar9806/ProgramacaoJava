package Lista1;

import java.util.Scanner;

public class Lista1_19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float totalGasto, totalIngressos, calculo;

        totalGasto = teclado.nextInt();
        totalIngressos = teclado.nextInt();

        calculo = totalGasto/totalIngressos;

        System.out.printf("%.0f\n ", calculo );
    }
}
