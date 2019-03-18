import java.util.Scanner;

public class Uri_1038 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int codigo, quantidade;
        float valor;

        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();
        teclado.nextLine();

        switch(codigo){
            case 1:
            valor = (float) (4.0*quantidade);
            System.out.printf("Total: R$ %.2f\n", valor );
            break;
            case 2:
            valor = (float) (4.50 * quantidade);
            System.out.printf("Total: R$ %.2f\n", valor);
            break;
            case 3:
            valor = (float) (5.0 * quantidade);
            System.out.printf("Total: R$ %.2f\n", valor);
            break;
            case 4:
            valor = (float) (2.0 * quantidade);
            System.out.printf("Total: R$ %.2f\n",valor);
            break;
            case 5:
            valor = (float) (1.50 * quantidade);
            System.out.printf("Total: R$ %.2f\n",valor);
            break;

        }

        /*if (codigo == 1){
            valor = (float) (4.0*quantidade);
            System.out.printf("Total: R$ %.2f\n", valor );
        }
        else if (codigo == 2) {
            valor = (float) (4.50 * quantidade);
            System.out.printf("Total: R$ %.2f\n", valor);
        }
        else if (codigo == 3) {
            valor = (float) (5.0 * quantidade);
            System.out.printf("Total: R$ %.2f\n", valor);
        }
        else if (codigo == 4) {
            valor = (float) (2.0 * quantidade);
            System.out.printf("Total: R$ %.2f\n",valor);
        }
        else if (codigo == 5) {
            valor = (float) (1.50 * quantidade);
            System.out.printf("Total: R$ %.2f\n",valor);
        }*/
    }
}
