import java.util.Scanner;
public class ordemtres{
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        

        int aux = 0;

        if(a > b){
            aux = a;
            a = b;
            b =aux;
        }if(b > c){
            aux = b;
            b = c;
            c = aux;
            
        }
        if(c > d){
            aux = c;
            c = d;
            d = aux;
            
        }
        if(a > b){
            aux = a;
            a = b;
            b =aux;
        }
        if(b > c){
            aux = b;
            b = c;
            c = aux;
            
        }if(a > b){
            aux = a;
            a = b;
            b =aux;
        }
        imprime();

    }
    public static void imprime(){
        System.out.printf("%d %d %d %d%n", a, b, c, d);
    }
}