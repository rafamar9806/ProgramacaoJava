import java.util.Scanner;

public class Lista1_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float centimetros, metros, conversao, divisao;

        System.out.println("Digite o tamanho dos degraus em centimetros");
        centimetros = teclado.nextFloat();

        System.out.println("Digite o tamanho da escada em metros");
        metros = teclado.nextFloat();

        conversao = centimetros/100;//convertendo os degraus de centimetros para metros
        divisao = metros/conversao;// calculando a quantidade de degraus que deverao ser subidos

        System.out.printf("%.0f\n",divisao);// imprimindo o resusltad
    }
}
