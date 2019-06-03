import java.util.Scanner;

public class Teclado{
    private static Scanner input;
    private static String texto;
    private static int numeroInteiro;
    private static double numDecimal;
    private static char caractere;

    public Teclado(){
        input = new Scanner(System.in);
    }

    /**
     * @param texto the texto to set
     */
    public static void setTexto() {
        Teclado.texto = input.next();
    }

    /**
     * @return the texto
     */
    public static String getTexto() {
        return texto;
    }
}