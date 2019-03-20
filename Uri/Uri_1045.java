import java.util.Scanner;

public class Uri_1045 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double a, b, c;
        double aux, bc, a2, b2, c2;
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        
        if (b>a) {
            aux = a;
            a = b;
            b = aux;
            
        }
        if (c>a) {
            aux = a;
            a = c;
            c = aux;
            
        }
        a2 = Math.pow(a, 2);
        bc = b+c;
        b2 = Math.pow(b, 2);
        c2 = Math.pow(c, 2);
        
        if (a>=b+c) {
            System.out.println("NAO FORMA TRIANGULO");
            
        }
        else{
            if (a2 > b2+c2) {
                System.out.println("TRIANGULO OBTUSANGULO");
                
            }
            else if (a2 < b2+c2) {
                System.out.println("TRIANGULO ACUTANGULO");
                
            }
            else{
                System.out.println("TRIANGULO RETANGULO");
            }
            
            }
            if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
            
            }
            else if (a == b || a == c || b == c) {
            System.out.println("TRIANGULO ISOSCELES");
            
        }
        
                               
        
    }
    
}
