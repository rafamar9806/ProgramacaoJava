import java.util.Scanner;

public class URI_1036 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        float A, B, C, R1, R2;

        A = teclado.nextFloat();

        B = teclado.nextFloat();

        C = teclado.nextFloat();



        if ((A == 0) || (((B*B) -(4*A*C)) < 0)) {

            System.out.print("Impossivel calcular\n");

        }else {

            R1 =(float) ((-B + Math.sqrt(((B*B) -(4*A*C)))) / (2*A));

            R2 =(float) ((-B - Math.sqrt(((B*B) -(4*A*C)))) / (2*A));



            System.out.printf("R1 = %.5f\n", R1);

            System.out.printf("R2 = %.5f\n", R2);

        }

    }

}

