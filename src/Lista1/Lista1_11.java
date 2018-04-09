import java.util.Scanner;

public class Lista1_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        double equacao12, equacao21;

        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        equacao12 = Math.pow(num1, num2);
        equacao21 = Math.pow(num2, num1);

        System.out.println("O primeiro elevado ao segundo é: "+equacao12);
        System.out.println("O segundo elevado ao primeiro é: "+equacao21);
    }
}
