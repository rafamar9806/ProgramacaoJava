import java.util.Scanner;

public class TelefoneSemFioVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] palOriginal, paltime1, paltime2;
        String palavraOriginal, time1, time2;
        int sem1 = 0;
        int sem2 = 0;
        int d = 0;
        int e = 0;

        System.out.println("Quantidade de Instancias");
        int instacias = input.nextInt();
        input.nextLine();

        for (int i = 0; i < instacias; i++) {
            System.out.println("Palavra Original");
            palavraOriginal = input.nextLine();

            System.out.println("Time 1, por favor, digite a frase");
            time1 = input.nextLine();
            while (time1.length() != palavraOriginal.length()) {
                System.out.println("numero de caracteres diferentes da palavra original.\ndigite novamente.");
                time1 = input.nextLine();
            }

            System.out.println("Time 2, por favor, digite a frase");
            time2 = input.nextLine();
            while (time2.length() != palavraOriginal.length()) {
                System.out.println("numero de caracteres diferentes da palavra original.\ndigite novamente.");
                time2 = input.nextLine();
            }

            palOriginal = new char[palavraOriginal.length()];
            paltime1 = new char[palavraOriginal.length()];
            paltime2 = new char[palavraOriginal.length()];

            for (int j = 0; j < palOriginal.length; j++) {
                palOriginal[j] = palavraOriginal.charAt(j);
            }

            for (int k = 0; k < paltime1.length; k++) {
                paltime1[k] = time1.charAt(k);
            }

            for (int l = 0; l < paltime2.length; l++) {
                paltime2[l] = time2.charAt(l);
            }

            while (d < palOriginal.length) {
                if (palOriginal[d] == paltime1[d]) {
                    sem1++;
                }
                d++;
            }

            while (e < palOriginal.length) {
                if (palOriginal[e] == paltime2[e]) {
                    sem2++;
                }
                e++;
            }

            System.out.printf("Instancia %d%n", (i + 1));

            if (sem1 > sem2) {
                System.out.println("Time 1 venceu!\tSemelhanças: " + sem1);

            }
            if (sem2 > sem1) {
                System.out.println("Time 2 venceu!\tSemelhanças: " + sem2);

            } else {
                System.out.println("Empatou");
            }
            System.out.println();//linha em branco

            //zerando contadores.
            sem1 = 0;
            sem2 = 0;

        }

    }
}