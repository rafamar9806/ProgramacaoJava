import java.util.Scanner;

public class Uri_1005 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, media;
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();

        media = (float) (((nota1*3.5) + (nota2*7.5)) / (3.5+7.5));

        System.out.printf("MEDIA = %.5f\n",media);

    }
}
