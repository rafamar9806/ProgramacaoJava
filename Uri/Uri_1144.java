import java.util.Scanner;

public class Uri_1144 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int entrada = input.nextInt();

        for (int i = 1; i <= entrada; i++) {
            for (int j = i; j < 2; j++) {

                System.out.println(i + " " + ((i * j)));

            }

        }

    }
}