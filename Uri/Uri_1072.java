/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri;

/**
 *
 * @author skynet
 */
import java.util.Scanner;
public class Uri_1072 {
    public static void main(String[] args) {
            
		int N , X, in = 0, out = 0;
		int intervalo_inicial =10,intervalo_final =20 ;
		
		Scanner input =new Scanner(System.in);
		
		N =input.nextInt();
		for (int i = 1; i <= N; i++) {
			X =input.nextInt();
			if (X >= intervalo_inicial && X <= intervalo_final) {
				in += 1;
			}else {
				out += 1;
			}
		}
		System.out.print(in+" in\n"+out +" out\n");
    }
}

		

	


    
    
  




