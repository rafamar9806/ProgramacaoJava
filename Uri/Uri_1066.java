/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri;

import java.util.Scanner;

/**
 *
 * @author skynet
 */
public class Uri_1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, par = 0, impar = 0, positivo = 0, negativo = 0;
        
        for (int i = 1; i <= 5; i++) {
            numero = teclado.nextInt();
            if (numero%2 ==0) {
                par+=1;
                
            }
            else if (numero%2 != 0) {
                impar+=1;
                
            }
            else if (numero>0) {
                positivo+=1;
                
            }else if (numero<0) {
                negativo+=1;
                
            }
            System.out.print(par+" valor(es) par(es)\n");
            System.out.print(impar+" valor(es) impar(es)\n");
            System.out.print(positivo+" valor(es) positivo(s)\n");
            System.out.print(negativo+" valor(es) negativo(s)\n");
            
            
            
        }
    }
    
}
