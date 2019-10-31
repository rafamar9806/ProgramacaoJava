import java.util.Scanner;

class ImprimeValor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor;
        String msg;

        System.out.println("Digite um número");
        valor = input.nextInt();

        if(valor < 0 || valor > 20)
            msg = "a";
        else if(valor < 5)
            msg = "b";
        
        else if(valor > 6 && valor < 12)
            msg="c";
        
        else if(valor != 15 && valor != 17)
            msg="d";
        else
            msg="e";
        System.out.println(msg);
    }
}