import java.util.Scanner;

public class Uri_1564{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int entrada = input.nextInt();
        int atualiza = 0;

        for (int i = 0; i <= 100; i++) {
            if (entrada == 0) {
                System.out.println("vai ter copa!");
            }else 
                System.out.println("vai ter duas!");
            
            entrada = input.nextInt();
        }
    }
}