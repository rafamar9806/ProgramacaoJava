package Uri;

import java.util.Scanner;

public class Uri_1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float num1, media = 0, total =0;
        int totalNumeros = 0;

        for (int cont = 1; cont<=6; cont++){
            num1 = teclado.nextFloat();
            if (num1 > 0){
                totalNumeros += 1;
                total += num1;
            }
        }
        media = total / totalNumeros;

        System.out.print(totalNumeros+" valores positivos\n");
        System.out.printf("%.1f\n", media);



    }
}
