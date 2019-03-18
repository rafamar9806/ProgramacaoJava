import java.util.Scanner;

public class Uri_1048 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario, aumento, novoSalario;

        salario = teclado.nextDouble();

        if (salario>=0 && salario<=400){
            aumento = salario * 0.15;
            novoSalario = salario+aumento;
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",aumento);
            System.out.println("Em percentual: 15 %");
        }
        else if (salario>400 && salario<=800) {
            aumento = salario * 0.12;
            novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.println("Em percentual: 12 %");
        }
        else if (salario>800 && salario<=1200) {
            aumento = salario * 0.10;
            novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.println("Em percentual: 10 %");
        }
        else if (salario>1200 && salario<=2000) {
            aumento = (salario * 7)/100;
            novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.println("Em percentual: 7 %");
        }
        else if(salario > 2000){
            aumento = (salario * 4)/100;
            novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.println("Em percentual: 4 %");

        }
    }
}
