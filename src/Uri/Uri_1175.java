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
public class Uri_1175 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] n = new int[3];
        
        for (int i = 0; i < n.length; i++) {
            n[i] = teclado.nextInt();
            
            System.out.printf("N[%d] = %d\n", i, n);
            
            
        }
    }
    
}
