package Uri;

import java.util.Scanner;

public class Uri_1017 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        double tempoViagem, velocidadeMedia;
        tempoViagem = teclado.nextDouble();
        velocidadeMedia = teclado.nextDouble();

        double quantidadeLitros = (velocidadeMedia*tempoViagem)/12;

        System.out.printf("%.3f\n", quantidadeLitros);
    }
}
