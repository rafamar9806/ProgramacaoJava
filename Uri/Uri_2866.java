import java.util.Scanner;

public class Uri_2866 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c = input.nextInt();
        String fraseDecoficada = "";
        char[] fraseCodificada;
        String[] strFrases = new String[c]; // array com a quantidade de frases que o usuario determinou

        for (int i = 0; i < c; i++) {
            strFrases[i] = input.next();

            fraseCodificada = new char[strFrases[i].length()];

            for (int j = 0; j < strFrases[i].length(); j++) {

                fraseCodificada[j] = strFrases[i].charAt(j);
            }

            int ini = 0;
            int fin = fraseCodificada.length - 1;
            char aux = ' ';

            while (ini < fin) {
                aux = fraseCodificada[ini];
                fraseCodificada[ini] = fraseCodificada[fin];
                fraseCodificada[fin] = aux;

                ini++;
                fin--;
            }
            for (int k = 0; k < fraseCodificada.length; k++) {
                if(Character.isLowerCase(fraseCodificada[k])){
                    fraseDecoficada+=fraseCodificada[k];

                }
            }

            // for (char var : fraseCodificada) {
            //     fraseDecoficada+=var;
            // }
            System.out.println(fraseDecoficada);
            fraseDecoficada = "";

        }

    }
}