public class Aluno {
    private String nome;
    private String rga;
    private String idade;
    private double media;
    private boolean status;


    public Aluno() {
        this.nome = "";
        this.rga = "";
        this.idade = "";
        this.status = false;
    }

    public Aluno(String nome, String rga, String idade) {
        this.nome = nome;
        this.rga = rga;
        this.idade = idade;
        
    }
    public Aluno(String nome, String rga) {
        this.nome = nome;
        this.rga = rga;
        
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

    public void setMedia(double media){
        this.media = media;
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

    public double getMedia(){
        return this.media;
    }

    public boolean equals(Aluno n){
        if (n.getNome().equals(this.nome)) {
            if (n.getRga().equals(this.rga)) {
                System.out.println("Tem al");
                   return true;

            }
        }
        
        return false;
    }

    public boolean getStatus(){
        if (this.media >= 6 && this.media <=10) {
            return true;
        }
        return false;
    }
    

}