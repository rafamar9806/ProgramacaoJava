import java.util.Scanner;
public class Lista1_3{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        float num1, num2, num3;
        System.out.println("Digite tres numeros para que eu possa calcular a media Ponderada");
        num1 = teclado.nextFloat();
        num2 = teclado.nextFloat();
        num3 = teclado.nextFloat();

        float media = (num1*2+num2*3+num3*5)/10;
        System.out.println("A média é: \n" + media)
    }
}

