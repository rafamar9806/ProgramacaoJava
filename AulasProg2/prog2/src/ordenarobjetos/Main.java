package ordenarobjetos;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidadeAlunos = input.nextInt();
        input.nextLine();
        ColecaoAlunos colecaoAlunos = new ColecaoAlunos(quantidadeAlunos);

        for (int i = 0; i < quantidadeAlunos; i++) {
            String rga = input.nextLine();
            String nome = input.nextLine();
            String curso = input.nextLine();
            double mediaAproveitamento = input.nextDouble();
            int porcentagemCursada = input.nextInt();
            input.nextLine();
            Aluno aluno = new Aluno(nome,curso, rga,mediaAproveitamento,porcentagemCursada);
            colecaoAlunos.adicionarAluno(aluno);
        }
        colecaoAlunos.selectionSort();
        System.out.println(colecaoAlunos);
    }

}
