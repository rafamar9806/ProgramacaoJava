import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Turma turma = new Turma();

        System.out.println("Informe a quantidade de alunos");
        int numAlunoss = input.nextInt();
        turma.numAlunos(numAlunoss);

        System.out.println("1 - Adicionar Alunos");
        System.out.println("2 - Imprimir alunos");
        System.out.println("3 - Numero de alunos reprovados");
        System.out.println("4 - numero de alunos aprovados");
        int select = input.nextInt();
        input.nextLine();

        do {

            switch (select) {

            case 1:
                System.out.println("Nome Aluno");
                String nome = input.nextLine();
                System.out.println("RGA");
                String rga = input.nextLine();
                System.out.println("Idade");
                String idade = input.nextLine();

                turma.addAlunos(nome, rga, idade);

                System.out.println("1 - Adicionar Alunos");
                System.out.println("2 - Imprimir alunos");
                System.out.println("3 - Numero de alunos reprovados");
                System.out.println("4 - numero de alunos aprovados");
                select = input.nextInt();
                input.nextLine();

                break;

            case 2:
            turma.imprimeAlunos();
                System.out.println("1 - Adicionar Alunos");
                System.out.println("2 - Imprimir alunos");
                System.out.println("3 - Numero de alunos reprovados");
                System.out.println("4 - numero de alunos aprovados");
                select = input.nextInt();
                input.nextLine();

                break;

            case 3:
                System.out.println("1 - Adicionar Alunos");
                System.out.println("2 - Imprimir alunos");
                System.out.println("3 - Numero de alunos reprovados");
                System.out.println("4 - numero de alunos aprovados");
                select = input.nextInt();
                input.nextLine();

                break;

            case 4:
                System.out.println("1 - Adicionar Alunos");
                System.out.println("2 - Imprimir alunos");
                System.out.println("3 - Numero de alunos reprovados");
                System.out.println("4 - numero de alunos aprovados");
                select = input.nextInt();
                input.nextLine();

                break;

            default:
                break;
            }

        } while (select != 0);
    }
}