import java.util.Scanner;

public class Lista1_8 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        float diagonaMaior, diagonalMenor, area;
        System.out.println("Digite a diagonal maior:");
        diagonaMaior = teclado.nextFloat();
        System.out.println("Digite a diagonal menor:");
        diagonalMenor = teclado.nextFloat();

        area = (diagonaMaior*diagonalMenor)/2;
        System.out.println("A Area do losango é:\n"+area);
    }
}
