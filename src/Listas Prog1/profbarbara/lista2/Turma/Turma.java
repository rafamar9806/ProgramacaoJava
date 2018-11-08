import java.util.Scanner;

public class Turma {
    private Aluno [] alunos;
    private static int i;
    public Turma() {
        
    }

    public void addAlunos(int quantidade, String nome, String rga, String idade){
        alunos = new Aluno[quantidade];

        Aluno n = new Aluno(nome, rga, idade);
        
        if (i < alunos.length) {

            if (alunos[i] == null) {
                alunos[i] = n;
                i++;
            }

        }
    }

    public void imprimeAlunos(){
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.printf("Nome: %s\tRGA: %s\tIdade: %s\n" , alunos[i].getNome(), alunos[i].getRga(), alunos[i].getIdade());

            }
        }

    }

    
}