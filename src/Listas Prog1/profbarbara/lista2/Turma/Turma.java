import java.util.Scanner;

public class Turma {
    private Aluno [] alunos;
    private Scanner input = new Scanner(System.in);
    private static int i;
    private double media;
    private Prova [] provas; 
    private Trabalho [] trabalhos; 

    public Turma() {

      this.media = 0.0;  
    }
    public void numAlunos(int quantidade){
         alunos = new Aluno[quantidade];
    }

    public void adicionarNotas(String rga, int qtdProvas, int qtdTrabalhos ){
        double pesoProva = 0.0;
        double pesoTrabalho = 0.0;
        double notaProva = 0.0;
        double notaTrabalho = 0.0;


        provas = new Prova[qtdProvas];

        for (int i = 0;i < provas.length ;i++ ) {
            
                System.out.println("Digite a nota da prova: " + i);
                notaProva = input.nextDouble();
                provas[i].setNotasProva(notaProva);
                            
        }
        trabalhos = new Trabalho[qtdTrabalhos];
        for (int i = 0;i < provas.length ;i++ ) {
            
                System.out.println("Digite a nota do trabalho: " + i);
                notaTrabalho = input.nextDouble();
                            
        }
    }

    public void addAlunos(String nome, String rga, String idade){
       

        Aluno n = new Aluno(nome, rga, idade);
        
        if (i < alunos.length) {

            if (alunos[i] == null) {
                alunos[i] = n;
                i++;
            }

        }else{
            System.out.println("Capacidade máxima atingida");
        }
    }

    public void imprimeAlunos(){
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.printf("Nome: %s\tRGA: %s\tIdade: %s\tMedia: %.2f\n" , alunos[i].getNome(), alunos[i].getRga(), alunos[i].getIdade(), this.media);

            }
        }

    }

    
}