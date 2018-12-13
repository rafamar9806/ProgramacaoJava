package Uri;

import java.util.Scanner;
public class Uri_1172{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] troca = new int[10];
        
        for (int i = 0; i < troca.length; i++) {
            troca[i] = input.nextInt();
            
        }

        for (int i = 0; i < troca.length; i++) {
            if (troca[i] <= 0) {
                troca[i] = 1;
                
            }
            
        }
        for (int i = 0; i < troca.length; i++) {
            System.out.printf("X[%d] = %d%n", i, troca[i]);
        }
    }
}