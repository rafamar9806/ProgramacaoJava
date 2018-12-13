package Uri;

import java.util.Scanner;
public class Uri_1013 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        int ab = (a+b+Math.abs(a-b))/2;
        int abc = (ab+c+Math.abs(ab-c))/2;
        System.out.println(abc + " eh o maior");
    }


}
