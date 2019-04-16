import java.util.Scanner;

public class Uri_1848 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        int soma = 0;

        while (i < 3) {
            String entrada = input.nextLine();

            if (entrada.equals("---")) {
                soma += 0;
            }
            if (entrada.equals("--*")) {
                soma += 1;
            }
            if (entrada.equals("-*-")) {
                soma += 2;
            }
            if (entrada.equals("-**")) {
                soma += 3;
            }
            if (entrada.equals("*--")) {
                soma += 4;
            }
            if (entrada.equals("*-*")) {
                soma += 5;
            }
            if (entrada.equals("**-")) {
                soma += 6;
            }
            if (entrada.equals("***")) {
                soma += 7;
            }
            
            if (entrada.equals("caw caw")) {
                System.out.println(soma);
                i++;
                soma = 0;
            }

        }

    }
}