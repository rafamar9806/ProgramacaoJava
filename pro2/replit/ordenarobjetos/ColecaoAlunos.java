package ordenarobjetos;
import java.util.Arrays;

public class ColecaoAlunos {
    Aluno [] alunos;
    private int quantidadeAlunos;

    public ColecaoAlunos() {
        this.alunos = new Aluno[100];
        quantidadeAlunos = 0;
    }
     public ColecaoAlunos(int n) {
        this.alunos = new Aluno[n];
        quantidadeAlunos = 0;
    }

    public boolean adicionarAluno(Aluno alu) {
        if (quantidadeAlunos>=alunos.length)
            return false;
        alunos[quantidadeAlunos] = alu;
        quantidadeAlunos++;
        return true;

    }
    public void selectionSort() {
        for (int i = 0; i < quantidadeAlunos; i++) {
            int menor = i;
            for (int j = i+1; j < quantidadeAlunos; j++) {
                if (alunos[j].compareTo(alunos[menor])<0) {
                    menor = j;
                }
            }

            troca(menor,i);

        }
    }

    private void troca(int menor, int i) {
        Aluno aux = new Aluno();
        aux = alunos[i];
        alunos[i] = alunos[menor];
        alunos[menor] = aux;


    }

    public String toString() {
        String str = "";
        for (int i = 0; i < this.quantidadeAlunos; i ++) {
            str += alunos[i] + "\n";
        }
        return str;
    }





}
