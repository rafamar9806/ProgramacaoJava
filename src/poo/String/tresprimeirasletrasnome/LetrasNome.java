import java.util.Scanner;

public class LetrasNome{
    private Scanner input;
    private String nome;

    public LetrasNome(){
        input = new Scanner(System.in);
        nome = "";
    }

    public void setNome(){
        this.nome = input.nextLine();
        
    }

    public String getNome(){
        return this.nome;
    }

    public String cortaString(){
        String nomeCortar = this.nome;
        if (nomeCortar.length() < 3) {
            System.out.println("nome menor que 3 letras");            
        }
        else{
            nomeCortar = nomeCortar.substring(0,3);
            return nomeCortar;
        }
        return "";
    }
}
