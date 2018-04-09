package Uri;

import java.util.Scanner;

public class Uri_1016 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int distanciaKm, minutos;
        distanciaKm = teclado.nextInt();

        minutos = distanciaKm*2;

        System.out.println(minutos + " "+ "minutos");
    }
}
