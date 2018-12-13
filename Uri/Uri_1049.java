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
public class Uri_1049 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String palavra1, palavra2, palavra3;
        palavra1 = teclado.next();
        palavra2 = teclado.next();
        palavra3 = teclado.next();
        
        if (palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("carnivoro")) {
            System.out.println("aguia"); 
        }
         if (palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("onivoro")) {
            System.out.println("pomba"); 
        }
          if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("onivoro")) {
            System.out.println("homem"); 
        }
           if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("herbivoro")) {
            System.out.println("vaca"); 
        }
            if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("hermatofago")) {
            System.out.println("pulga"); 
        }
             if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("herbivoro")) {
            System.out.println("lagarta"); 
        }
              if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("hermatofago")) {
            System.out.println("sanguessuga"); 
        }
               if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("onivoro")) {
            System.out.println("minhoca"); 
        }
        
        
        
    }
    
}
