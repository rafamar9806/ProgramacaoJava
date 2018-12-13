public class Pessoa{
    private int idade;
    private String nome;

    public void fazAniversario(){
        this.idade++;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void imprimeInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Rafael");
        p1.setIdade(19);
        p1.imprimeInfo();

        
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();

        p1.imprimeInfo();
    }
}