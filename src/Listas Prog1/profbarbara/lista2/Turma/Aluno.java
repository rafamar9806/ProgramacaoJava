public class Aluno {
    private String nome;
    private String rga;
    private String idade;

    public Aluno() {
        this.nome = "";
        this.rga = "";
        this.idade = "";
    }

    public Aluno(String nome, String rga, String idade) {
        this.nome = nome;
        this.rga = rga;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRga() {
        return this.rga;
    }

    public String getIdade() {
        return this.idade;
    }

}