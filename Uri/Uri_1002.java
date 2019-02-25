

import java.util.Scanner;

public class Uri_1002 {
    public static final double AREA_CIRCULO = 3.14159;
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        double area, raio;
        raio = teclado.nextDouble();
        area = AREA_CIRCULO*raio*raio;
        System.out.printf("A=%.4f\n",area);
    }
}
