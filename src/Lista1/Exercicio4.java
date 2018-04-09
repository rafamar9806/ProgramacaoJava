package Lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        double salario, novoSalario;
        System.out.println("digite o valor do seu salario para que eu possa calcular as mudanças");
        salario = teclado.nextDouble();

        novoSalario = (salario/100*25)+salario;

        System.out.println("Novo salario:\n" + novoSalario);
        

    }
}
