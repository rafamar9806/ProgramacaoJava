import java.util.Scanner;


public class Uri_1021 {

    public static void main(String[] args) {
        float numeroNotas;

        Scanner sc = new Scanner(System.in);
        numeroNotas = sc.nextFloat();

        float centavos = numeroNotas*100;

        float notaCem = numeroNotas / 100;
        numeroNotas = numeroNotas%100;

        float notaCinquenta = numeroNotas / 50;
        numeroNotas = numeroNotas%50;

        float notaVinte = numeroNotas / 20;
        numeroNotas = numeroNotas%20;

        float notaDez = numeroNotas / 10;
        numeroNotas = numeroNotas%10;

        float notaCinco = numeroNotas / 5;
        numeroNotas = numeroNotas%5;

        float notaDois = numeroNotas / 2;
        numeroNotas = numeroNotas%2;

        float moedaUmReal = numeroNotas / 1;
        numeroNotas = numeroNotas%1;

        centavos = centavos%100;

        float moedaCinquenta = centavos / 50;
        centavos %= 50;
        float moedaVinteECinco = centavos / 25;
        centavos %= 25;
        float moedaDez = centavos / 10;
        centavos %= 10;
        float moedaCinco = centavos / 5;
        centavos %= 5;
        float moedaDeUm = centavos;

        System.out.println("NOTAS:");
        System.out.println((int)notaCem + " nota(s) de R$ 100.00");
        System.out.println((int)notaCinquenta + " nota(s) de R$ 50.00");
        System.out.println((int)notaVinte + " nota(s) de R$ 20.00");
        System.out.println((int)notaDez + " nota(s) de R$ 10.00");
        System.out.println((int)notaCinco + " nota(s) de R$ 5.00");
        System.out.println((int)notaDois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)moedaUmReal + " moeda(s) de R$ 1.00");
        System.out.println((int)moedaCinquenta + " moeda(s) de R$ 0.50");
        System.out.println((int)moedaVinteECinco + " moeda(s) de R$ 0.25");
        System.out.println((int)moedaDez + " moeda(s) de R$ 0.10");
        System.out.println((int)moedaCinco + " moeda(s) de R$ 0.05");
        System.out.println((int)moedaDeUm + " moeda(s) de R$ 0.01");




    }

}