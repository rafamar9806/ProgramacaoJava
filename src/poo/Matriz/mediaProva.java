import java.util.Scanner;

public class mediaProva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numAlunos, numProvas;
        double media = 0.0; // iniciando

        System.out.println("Digite a quantidade de alunos");
        numAlunos = input.nextInt();

        System.out.println("Digite a quantidade de provas");
        numProvas = input.nextInt();

        double[][] notasAlunos = new double[numAlunos][numProvas];

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println("Aluno: " + i + " Prova: " + j);
                notasAlunos[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + "\t");

            }
            System.out.println();
        }
        // media por aluno
        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                media+=notasAlunos[i][j];
               
            }
            media/=notasAlunos[i].length;
            System.out.println("Media Aluno: " + i + " = " + media);
            media = 0;
        }
        //media por prova
        for (int i = 0; i < notasAlunos[0].length; i++) {
            for (int j = 0; j < notasAlunos.length; j++) {
                media += notasAlunos[j][i];

            }
            media /= notasAlunos.length;
            System.out.println("Media por prova: " + i + " = " + media);
            media = 0;
        }

    }
}