import java.util.Scanner;

public class InverteNome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a palavra que sera invertida");
        String palavraOriginal = input.nextLine();

        String copiaPalavra = palavraOriginal; //recebendo palavra original

        for (int i = (copiaPalavra.length() - 1); i>=0 ; i--) {
            System.out.print(copiaPalavra.charAt(i));
            
        }
        System.out.println();
    }
}