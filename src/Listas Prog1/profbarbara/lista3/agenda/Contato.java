
public class Contato {
    private String nome;
    private String telefone;
    private String sobrenome;
    
    public Contato() {
        this.nome = "";
        this.sobrenome = "";
        this.telefone = "";
    }

    public Contato(String nome, String sobrenome, String telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }
    
    public Contato(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void imprimeListaContatos(){
        System.out.println("-------------------------");
        System.out.printf("Nome: %s %s\t Telefone: %s\n" ,this.nome, this.sobrenome, this.telefone);

    }

    public boolean equals(Contato con){
        if (con.getNome().equals(this.nome)) {
            if (con.getSobrenome().equals(this.sobrenome)) {
                return true;
            }
        }
        return false;
    }
}