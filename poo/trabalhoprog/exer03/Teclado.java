import java.util.Scanner;

public class Teclado{
    private static Scanner input = new Scanner(System.in);
    private static String texto;
    private static int numeroInteiro;
    private static double numDecimal;

    public static String nextLine() {
    	texto = input.nextLine();
        return texto;
    }

    public static int nextInt() {
    	numeroInteiro = input.nextInt();
        return numeroInteiro;
    }

    public static double nextDouble() {
    	numDecimal = input.nextDouble();
        return numDecimal;
    }

     
}
