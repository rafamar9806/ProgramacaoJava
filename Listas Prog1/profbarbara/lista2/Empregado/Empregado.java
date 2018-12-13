public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salario < 0) {
            salario = 0;
        } else {
            this.salario = salario;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            salario = 0;
        } else {
            this.salario = salario;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void aumentarSalario(){
        this.salario += salario * 0.10;
    }

    public void exibeInfo(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=--=--=");
        System.out.printf("Nome: %s\tSobrenome: %s\tSalario: %s\n" , this.nome, this.sobrenome, this.salario);
        
    }
}