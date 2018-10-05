

public class Sobrecarga {
    private String nome;
    private int rg;
    private double rgDouble;


    public Sobrecarga(){
    	
    }
     {
            System.out.println("Dentro do bloco de inicialização");
   }   
    public Sobrecarga(String nome, int rg){
    	this.nome = nome;
    	this.rg = rg;
    }
    public Sobrecarga(int rg, String nome){
    	this.rg = rg;
    	this.nome = nome;
    }

    public void setNome(String nome){
    	this.nome = nome;
    }
    public void setRg(int rg){
    	this.rg = rg;
    }

    public void setRg(double rg){
        this.rgDouble = rg;
    }

    public double getRgDouble(){
        return this.rgDouble;
    }

    public String getNome(){
    	return this.nome;

    }

    public int getRg(){
    	return this.rg;
    }
}
