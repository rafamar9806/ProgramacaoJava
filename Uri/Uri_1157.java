package Uri;

import java.util.Scanner;

public class Uri_1157{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int entrada = input.nextInt();
        int divisor = 1;
        
        while (divisor <= entrada) {
            if (entrada%divisor==0) {
                System.out.println(divisor);
                
            }
            divisor++;
            
        }
    }
}