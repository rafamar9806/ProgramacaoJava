package Lista1;

import java.util.Scanner;

import static java.lang.System.*;

public class Exercicio2 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(in);
        float num1, num2, num3;
        System.out.println("Digite tres numeros para que eu possa calcular a media aritimetica");
        num1 = teclado.nextFloat();
        num2 = teclado.nextFloat();
        num3 = teclado.nextFloat();

        float media = (num1+num2+num3)/3;
        System.out.println("A média é: \n" + media);
    }
}
