import java.util.Scanner;

public class Lista1_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float pes;

        System.out.println("Digite um número em pés que voce gostaria de fazer a conversão");
        pes = teclado.nextFloat();

        float polegadas = pes*12;
        float jardas = pes/3;
        float milhas = pes/5280;
        System.out.println("Valor em polegadas: "+polegadas);
        System.out.println("Valor em jardas: "+jardas);
        System.out.println("Valor em Milhas: "+milhas);

    }
}
