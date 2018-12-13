import java.util.Scanner;

public class Uri_1042 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;

        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();

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

    }
}
