import java.util.Scanner;

public class Uri_1024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char abc = 'a';
        String palavraModificada = "";

        int numTestes = input.nextInt();
        input.nextLine();

        for (int j = 0; j < numTestes; j++) {
            String palavra = input.nextLine();
            
            char[] pSeparada = new char[palavra.length()];

            for (int i = 0; i < palavra.length(); i++) {
                pSeparada[i] = palavra.charAt(i);
            }

            for (int i = 0; i < pSeparada.length; i++) { // primeira passada
                if (Character.isLetter(pSeparada[i])) {
                    pSeparada[i] = (char) (pSeparada[i] + 3);
                } else {
                    continue;
                }
            }

            int prChar = 0;
            int lChar = pSeparada.length - 1;
            char aux = ' ';

            while (prChar < lChar) { // segunda passada
                aux = pSeparada[prChar];
                pSeparada[prChar] = pSeparada[lChar];
                pSeparada[lChar] = aux;

                prChar++;
                lChar--;
            }

            for (int i = (pSeparada.length / 2); i < pSeparada.length; i++) {// terceira passada
                pSeparada[i] = (char) (pSeparada[i] - 1);

            }

            for (int i = 0; i < pSeparada.length; i++) {
                palavraModificada += pSeparada[i];
            }

            System.out.println(palavraModificada);
            palavraModificada = "";
        }

    }
}