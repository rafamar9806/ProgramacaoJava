import java.util.Scanner;

public class Uri_1042 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3, aux;
        int num1C, num2C, num3C;//vai armazenar copia das variaveis 


        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();

        num1C = num1;
        num2C = num2;
        num3C = num3;

        if (num1>num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num2>num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
         if (num1>num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        System.out.println(num1 +"\n"+num2+"\n"+num3);

        System.out.println("");
        System.out.println(num1C);
        System.out.println(num2C);
        System.out.println(num3C);
        /*
        if( ( num1 < num2 && num1 < num3 ) && ( num2 < num3 ) ) { //  num1 > num2 > num3
            System.out.println(num1 +"\n"+num2+"\n"+num3);
        }
        else if( ( num1 < num2 && num1 < num3 ) && ( num3 < num2 ) ) { // num1 > num3 > num2
            System.out.println(num1 +"\n"+num3+"\n"+num2);

        }
        else if( ( num2 < num1 && num2 < num3 ) && ( num1 < num3 ) ) { //num2 > num1 > num3
            System.out.println(num2 +"\n"+num1+"\n"+num3);

        }
        else if( ( num2 < num1 && num2 < num3 ) && ( num3 < num1 ) ) { // num2 > num3 > num1
            System.out.println(num2 +"\n"+num3+"\n"+num1);

        }
        else if( ( num3 < num1 && num3 < num2 ) && ( num1 < num2 ) ) { // num3 > num1 > num2
            System.out.println(num3 +"\n"+num1+"\n"+num2);

        }
        else if( ( num3 < num1 && num3 < num2 ) && ( num2 < num1 ) ) { // num3 > num2 > num1
            System.out.println(num3 +"\n"+num2+"\n"+num1);

        }


        System.out.println("");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        */

    }
}
