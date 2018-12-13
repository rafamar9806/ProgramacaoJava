package Uri;

import java.util.Scanner;

public class Uri_1018 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int notas, quantidadeCedulas;
        notas = teclado.nextInt();

        System.out.printf("%d\n", notas);
        System.out.printf("%d nota(s) de R$ 100,00\n", notas/100);
        quantidadeCedulas = (notas%100);


        System.out.printf("%d nota(s) de R$ 50,00\n", quantidadeCedulas/50);
        quantidadeCedulas = (quantidadeCedulas%50);

        System.out.printf("%d nota(s) de R$ 20,00\n", quantidadeCedulas/20);
        quantidadeCedulas = (quantidadeCedulas%20);

        System.out.printf("%d nota(s) de R$ 10,00\n", quantidadeCedulas/10);
        quantidadeCedulas = (quantidadeCedulas%10);

        System.out.printf("%d nota(s) de R$ 5,00\n", quantidadeCedulas/5);
        quantidadeCedulas = (quantidadeCedulas%5);

        System.out.printf("%d nota(s) de R$ 2,00\n", quantidadeCedulas/2);
        quantidadeCedulas = (quantidadeCedulas%2);

        System.out.printf("%d nota(s) de R$ 1,00\n", quantidadeCedulas/1);

    }

}