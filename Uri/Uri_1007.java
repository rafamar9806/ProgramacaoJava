import java.util.Scanner;
public class Uri_1007{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] variaveis;
        int diferenca = 0;
        variaveis = new int[4];

        for (int i = 0; i < variaveis.length; i++) {
            variaveis [i] = input.nextInt();
        }

        diferenca = (variaveis[0] * variaveis [1]) - (variaveis[2] * variaveis [3]);

        System.out.println("DIFERENCA = " + diferenca);



    }
}