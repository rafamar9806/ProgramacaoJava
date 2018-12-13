import java.util.Scanner;

public class Uri_1044 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, mod;
        a = teclado.nextInt();
        b = teclado.nextInt();


        if (a%b == 0|| b%a == 0){
            System.out.println("Sao Multiplos");

        }
        else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
