public class Cliente extends Pessoa{
    private String cpf;

    public Cliente(String nome, String endereco, String cpf){
        super(nome, endereco);
        this.cpf = cpf;
    }

    
    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("CPF: " + cpf);
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }


}