import java.util.Scanner;

public class Lista1_18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int segundos, minutos, horas;

        System.out.println("Digite o tempo em segundos");
        segundos = teclado.nextInt();

        horas = (segundos/3600);
        segundos = segundos-(horas*3600);

        minutos = (segundos/60);
        segundos = segundos-(minutos*60);

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

    }
}
