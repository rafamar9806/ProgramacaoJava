import java.util.Scanner;

public class Lista1_7 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        float angulo1, angulo2, angulo3;
        System.out.println("Digite o valor do primeiro angulo");
        angulo1 = teclado.nextFloat();
        System.out.println("Digite o valor do segundo angulo");
        angulo2 = teclado.nextFloat();

        angulo3 = 180-angulo1-angulo2;

        System.out.println("o Valor do terceiro angulo é:\n"+angulo3);
    }
}
