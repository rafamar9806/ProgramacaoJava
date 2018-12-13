
public class Contato {
    private String nome;
    private String telefone;
    private String sobrenome;
    public static int numContatos;

    public Contato(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        numContatos++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void imprimeListaContatos() {
        System.out.printf("Nome: %s %s\t Telefone: %s\n", this.nome, this.sobrenome, this.telefone);

    }
    
    public static void imprimeListaContatos(Contato c) {
        System.out.printf("Nome: %s %s\t Telefone: %s\n", c.getNome(), c.getSobrenome(), c.getTelefone());

    }

    public static int getNumDeContatos() {
        return numContatos;
    }
    
    public static void setNumDeContatos(int numContatosAtualizado) {
        numContatos = numContatosAtualizado;
    }
}