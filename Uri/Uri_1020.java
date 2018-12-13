import java.util.Scanner;


public class Uri_1020 {

    public static void main(String[] args) {
        int idadeDias;

        Scanner sc = new Scanner(System.in);
        idadeDias = sc.nextInt();

        int ano = idadeDias / 365;
        idadeDias = idadeDias%365;

        int mes = idadeDias / 30;
        idadeDias = idadeDias%30;

        int dia = idadeDias;

        System.out.println(ano +" ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(idadeDias+ " dia(s)");

    }

}