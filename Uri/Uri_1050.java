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
public class Uri_1050 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dDD;
        dDD = teclado.nextInt();
        
        if (dDD == 61) {
            System.out.println("Brasilia");
            
        }else if (dDD == 71) {
            System.out.println("Salvador");
            
        }else if (dDD == 11) {
            System.out.println("Sao Paulo");
            
        }else if (dDD == 21) {
            System.out.println("Rio de Janeiro");
            
        }else if (dDD == 32 ) {
            System.out.println("Juiz de Fora");
            
        }else if (dDD == 19) {
            System.out.println("Campinas");
            
        }else if (dDD == 27) {
            System.out.println("Vitoria");
            
        }else if (dDD == 31) {
            System.out.println("Belo Horizonte");
            
        }else{
            System.out.println("DDD nao cadastrado");
        }
      
    }
    
}
