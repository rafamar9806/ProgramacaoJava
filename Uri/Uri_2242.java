import java.util.Scanner;

public class Uri_2242 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String risada = input.next();
        String novarisada = "";

        risada = risada.toLowerCase();
        risada = risada.replaceAll("[aáàãâ]", "a");
        risada = risada.replaceAll("[eéèẽê]", "e");
        risada = risada.replaceAll("[iíìĩî]", "i");
        risada = risada.replaceAll("[oóòõô]", "o");
        risada = risada.replaceAll("[uúùũû]", "u");

        for (int i = 0; i < risada.length(); i++) {
            if (risada.charAt(i) == 'a' || risada.charAt(i) == 'e' || risada.charAt(i) == 'i' || risada.charAt(i) == 'o'
                    || risada.charAt(i) == 'u') {
                novarisada += risada.charAt(i);
            }
        }

        int i = 0;
        int j = novarisada.length() - 1;

        boolean ehrisada = true;

        while (i < j) {
            if (novarisada.charAt(i) != novarisada.charAt(j)) {
                ehrisada = false;
                break;
            }
            i++;
            j--;
        }

        if (ehrisada) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }
}