import java.util.Scanner;

public class Uri_1176 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada, numero;
        long fibo[] = new long[61];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        entrada = input.nextInt();
        for (int j = 0; j < entrada; j++) {
            numero = input.nextInt();

            System.out.println("Fib(" + numero + ") = " + fibo[numero]);

        }

    }

}
