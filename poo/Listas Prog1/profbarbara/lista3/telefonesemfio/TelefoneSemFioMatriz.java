import java.util.Scanner;

public class TelefoneSemFioMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade de jogos");
        int quantidadeJogos = input.nextInt();

        char[][] frases = new char[3][3];

        for (int i = 0; i < quantidadeJogos; i++) {
            String fraseOriginal = "O rato roeu a roupa do rei.";
            String frase1 = "O ator morreu, garoupa rei.";
            String frase2 = "O pato moeu garoupa dorlei.";

          
                frases[0][] = fraseOriginal.charAt(k);

            

        }
        for (int j = 0; j < frases.length; j++) {
            for (int k = 0; k < frases.length; k++) {
                System.out.print(frases[j][k] + " ");

            }
        }
    }
}