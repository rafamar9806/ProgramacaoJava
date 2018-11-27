import java.util.Scanner;

public class Turma {
    private Aluno[] alunos;
    private Scanner input = new Scanner(System.in);
    private static int i;
    private double[] provas;
    private double[] trabalhos;
    private int posiAluno = -1;
    private double notas = 0.0;

    public void numAlunos(int quantidade) {
        alunos = new Aluno[quantidade];
    }

    public static int nAlunos(){
        return i;
    }

    public void addAlunos(String nome, String rga, String idade) {
        Aluno n = new Aluno(nome, rga, idade);
        double notaTotalProvas = 0.0;
        double notaTotalTrabalhos = 0.0;
        double notaFinal = 0.0;

        System.out.println("Quantidade de provas");
        int qtdProvas = input.nextInt();
        provas = new double[qtdProvas];

        System.out.println("Quantidade de trabalhos");
        int qtdTrabalhos = input.nextInt();
        trabalhos = new double[qtdTrabalhos];

        for (int i = 0; i < provas.length; i++) {
            double pesoProva = 0.0;

            System.out.println("Nota da Prova " + i);

            System.out.println("Digite um valor entre 0 e 10");
            double val = input.nextDouble();
            while (val < 0 || val > 10) {
                System.out.println("Nota da Prova " + i);
                System.out.println("Digite um valor entre 0 e 10");

                val = input.nextDouble();
            }
            provas[i] = val;
            System.out.println("Informe o peso da prova " + i);
            System.out.println("Digite um valor entre 0 e 10");

            double p = input.nextDouble();
            while (p < 0 || p > 10) {
                System.out.println("Informe o peso da prova " + i);
                System.out.println("Digite um valor entre 0 e 10");

                p = input.nextDouble();
            }
            pesoProva = p;

            pesoProva = pesoProva / 10;
            provas[i] *= pesoProva;
            notaTotalProvas += provas[i];

        }

        for (int i = 0; i < trabalhos.length; i++) {
            boolean notaValida = false;
            double pesoTrabalho = 0.0;
            System.out.println("Nota do Trabalho " + i);
            System.out.println("Digite um valor entre 0 e 10");

            double val = input.nextDouble();

            while (val < 0 || val > 10) {
                System.out.println("Nota do Trabalho " + i);
                System.out.println("Digite um valor entre 0 e 10");
                val = input.nextDouble();

            }

            trabalhos[i] = val;

            System.out.println("Informe o peso do trabalho " + i);
            double p = input.nextDouble();
            while (p < 0 || p > 10) {
                System.out.println("Informe o peso do trabalho " + i);
                System.out.println("Digite um valor entre 0 e 10");

                p = input.nextDouble();
            }
            pesoTrabalho = p;
            pesoTrabalho = pesoTrabalho / 10;
            trabalhos[i] *= pesoTrabalho;
            notaTotalTrabalhos += trabalhos[i];

        }

        notaFinal = notaTotalProvas + notaTotalTrabalhos;
        if (notaFinal < 0 && notaFinal > 10) {
            notaFinal = 0.0;
        }
        if (i < alunos.length) {

            if (alunos[i] == null) {
                alunos[i] = n;
                alunos[i].setMedia(notaFinal);
                i++;
            }

        } else {
            System.out.println("Capacidade máxima atingida");
        }
    }

    public void buscarAluno(String nome, String rga) {
        System.out.println("=-=-=-==-=-=-=-=-=-=-=-=-=-=-==-");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                if (nome.equals(alunos[i].getNome())) {
                    if (rga.equals(alunos[i].getRga())) {
                        System.out.printf("Nome: %s\tRGA: %s\tIdade: %s\tMedia: %.2f\n", alunos[i].getNome(),
                                alunos[i].getRga(), alunos[i].getIdade(), alunos[i].getMedia());
                    }

                }

            }
        }

    }

    public void imprimeAlunos() {
        System.out.println();
        System.out.println("--=-=-=-=-=-=-=-=-=-=-=-=");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.printf("Nome: %s\tRGA: %s\tIdade: %s\tMedia: %.2f\tSituação: %b\n", alunos[i].getNome(),
                        alunos[i].getRga(), alunos[i].getIdade(), alunos[i].getMedia(), alunos[i].getStatus());

            }
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();


    }

    public void alunosAprovados(){
        int numAprovados = 0;
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i]!=null) {
                if (alunos[i].getMedia()>= 6 && alunos[i].getMedia() <=10) {
                    System.out.printf("Nome: %s\tRGA: %s\tIdade: %s\tMedia: %.2f\n", alunos[i].getNome(),
                            alunos[i].getRga(), alunos[i].getIdade(), alunos[i].getMedia());
                    numAprovados++;
                }
            }
        }
        System.out.println("Numero de alunos Aprovados: " + numAprovados);
        System.out.println();
    }
    
    public void alunosReprovados() {
        int numReprovados = 0;
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                if (alunos[i].getMedia() >= 0 && alunos[i].getMedia() < 6) {
                    System.out.printf("Nome: %s\tRGA: %s\tIdade: %s\tMedia: %.2f\n", alunos[i].getNome(),
                            alunos[i].getRga(), alunos[i].getIdade(), alunos[i].getMedia());
                    numReprovados++;
                }
            }
        }
        System.out.println("Numero de alunos Reprovados: " + numReprovados);
        System.out.println();
    }

    public double mediaPorAlunos(){
        double media = 0.0;

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i]!=null) {
                media += alunos[i].getMedia();
            }
        }
        media = media / i;

        return media;

    }

    public void mediaPorProva(){
        double mProva = 0.0;
        for (int j = 0; j < provas.length; j++) {
            mProva = provas[j];
            mProva = mProva / i;
            System.out.println("Media Prova: " + j + " = " + mProva);

        }
    }

}