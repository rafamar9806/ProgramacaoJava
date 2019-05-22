public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void imprimirInformacoes(){
        System.out.print("Nome: " + nome + " Endereco: " + endereco + " ");
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}