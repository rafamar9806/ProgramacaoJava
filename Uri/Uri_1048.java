import java.util.Scanner;

public class Uri_1048 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float salario;

        salario = teclado.nextFloat();

        if (salario>0 && salario<=400){
            float aumento = (salario*15)/100;
            float novoSalario = salario+aumento;
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",aumento);
            System.out.print("Em percentual: 15 %");
        }
        else if (salario>400 && salario<=800) {
            float aumento = (salario * 12) / 100;
            float novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.println("Em percentual: 12 %");
        }
        else if (salario>800 && salario<=1200) {
            float aumento = (salario * 10) / 100;
            float novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.println("Em percentual: 10 %");
        }
        else if (salario>1200 && salario<=2000) {
            float aumento = (salario * 7) / 100;
            float novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.println("Em percentual: 7 %");
        }
        else {
            float aumento = (salario * 4) / 100;
            float novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f", novoSalario);
            System.out.printf("Reajuste ganho: %.2f", aumento);
            System.out.println("Em percentual: 4 %");

        }
    }
}
