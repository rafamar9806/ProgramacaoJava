import java.util.Scanner;
public class Uri_1009 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        double salarioFixo, vendas, novoSalario;
        String nome = teclado.next();
        salarioFixo = teclado.nextDouble();
        vendas = teclado.nextDouble();

        novoSalario = (vendas/100*15);
        novoSalario = novoSalario+salarioFixo;

        System.out.printf("TOTAL = R$ %.2f\n", novoSalario);
    }
}
