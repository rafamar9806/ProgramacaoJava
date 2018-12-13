package poo.agenda;

public class Contato {
    private String nome;
    private String email;
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }
}