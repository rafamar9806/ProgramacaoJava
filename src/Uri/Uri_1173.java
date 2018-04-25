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
public class Uri_1173 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] N = new int [10];
        N[0] = teclado.nextInt();
        
        if (N [0]<= 50) {
            for (int i = 1; i < N.length; i++) {
            N[i] = N[i-1]*2;
            
        }
            for (int i = 0; i < N.length; i++) {
            System.out.printf("N[%d] = %d\n", i, N[i]);
            
        }
            
        
            
        }
        else{
            return;
        }
        
            
        }
        
    }
    

