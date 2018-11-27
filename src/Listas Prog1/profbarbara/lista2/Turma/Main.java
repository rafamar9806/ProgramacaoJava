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
        System.out.println("3 - Adicionar Nota de Aluno");
        System.out.println("4 - numero de alunos aprovados");
        System.out.println("5 - numero de alunos aprovados");
        System.out.println("6 - Media por aluno");
        System.out.println("7 - Media por prova");

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
                System.out.println("3 - buscar aluno");
                System.out.println("4 - numero de alunos aprovados");
                System.out.println("5 - numero de alunos aprovados");
                System.out.println("6 - Media por aluno");
                System.out.println("7 - Media por prova");

                select = input.nextInt();
                input.nextLine();

                break;

            case 2:
                System.out.println("Número de alunos cadastrados: " + Turma.nAlunos());
                turma.imprimeAlunos();
                System.out.println("1 - Adicionar Alunos");
                System.out.println("2 - Imprimir alunos");
                System.out.println("3 - buscar aluno");
                System.out.println("4 - numero de alunos aprovados");
                System.out.println("5 - numero de alunos aprovados");
                System.out.println("6 - Media por aluno");
                System.out.println("7 - Media por prova");

                select = input.nextInt();
                input.nextLine();

                break;

            case 3:
                System.out.println("Nome do Aluno");
                String n = input.nextLine();
                System.out.println("Informe o RGA do aluno");
                String rgaa = input.nextLine();

                turma.buscarAluno(n, rgaa);

                System.out.println("1 - Adicionar Alunos");
                System.out.println("2 - Imprimir alunos");
                System.out.println("3 - buscar aluno");
                System.out.println("4 - numero de alunos aprovados");
                System.out.println("5 - numero de alunos aprovados");
                System.out.println("6 - Media por aluno");
                System.out.println("7 - Media por prova");

                select = input.nextInt();
                input.nextLine();

                break;

            case 4:
                turma.alunosAprovados();
                System.out.println("1 - Adicionar Alunos");
                System.out.println("2 - Imprimir alunos");
                System.out.println("3 - buscar aluno");
                System.out.println("4 - numero de alunos aprovados");
                System.out.println("5 - numero de alunos aprovados");
                System.out.println("6 - Media por aluno");
                System.out.println("7 - Media por prova");

                select = input.nextInt();
                input.nextLine();

                break;
                case 5:
                turma.alunosReprovados();
                System.out.println("1 - Adicionar Alunos");
                System.out.println("2 - Imprimir alunos");
                System.out.println("3 - buscar aluno");
                System.out.println("4 - numero de alunos aprovados");
                System.out.println("5 - numero de alunos aprovados");
                System.out.println("6 - Media por aluno");
                System.out.println("7 - Media por prova");

                select = input.nextInt();
                input.nextLine();

                break;
                case 6:
                System.out.println("Média por aluno: " + turma.mediaPorAlunos());
                System.out.println("1 - Adicionar Alunos");
                System.out.println("2 - Imprimir alunos");
                System.out.println("3 - buscar aluno");
                System.out.println("4 - numero de alunos aprovados");
                System.out.println("5 - numero de alunos aprovados");
                System.out.println("6 - Media por aluno");
                System.out.println("7 - Media por prova");

                select = input.nextInt();
                input.nextLine();

                break;
                case 7:
                turma.mediaPorProva();
                System.out.println("1 - Adicionar Alunos");
                System.out.println("2 - Imprimir alunos");
                System.out.println("3 - buscar aluno");
                System.out.println("4 - numero de alunos aprovados");
                System.out.println("5 - numero de alunos aprovados");
                System.out.println("6 - Media por aluno");
                System.out.println("7 - Media por prova");

                select = input.nextInt();
                input.nextLine();

                break;

            default:
                break;
            }

        } while (select != 0);
    }
}